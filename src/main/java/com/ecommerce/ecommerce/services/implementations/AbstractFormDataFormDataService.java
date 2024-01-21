package com.ecommerce.ecommerce.services.implementations;

import com.ecommerce.ecommerce.services.interfaces.IAbstractFormDataService;
import com.ecommerce.ecommerce.services.utils.FileUploadUtil;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class AbstractFormDataFormDataService<T, TRequestModel, PrimaryType> extends AbstractService<T, PrimaryType> implements IAbstractFormDataService<T, TRequestModel, PrimaryType> {
    protected HashMap<String, HashMap<String, String>> fieldMapping;
    protected Class<T> ClassModel;
    protected Class<TRequestModel> ClassRequestModel;
    protected FileUploadUtil fileUploadUtil;

    public void createFieldMapping(String fieldName, String getter, String setter, String getterRequestModel) {
        HashMap<String, String> fieldMapping = new HashMap<>();
        fieldMapping.putIfAbsent("getter", getter);
        fieldMapping.putIfAbsent("setter", setter);
        fieldMapping.putIfAbsent("getterRequestModel", getterRequestModel);
        this.fieldMapping.putIfAbsent(fieldName, fieldMapping);
    }

    public T setValuesToInstance(T modelInstance, TRequestModel instance) {
        Field[] fields = this.ClassRequestModel.getDeclaredFields();
        Arrays.stream(fields).forEach((Field field) -> {
            String name = field.getName();
            if(!name.equals("true") && !name.equals("false") && !name.equals("id")) {
                try {
                    HashMap<String, String> fieldMapper = this.fieldMapping.get(name);
                    Method setter = this.ClassModel.getMethod(this.fieldMapping.get(name).get("setter"), field.getType().equals(MultipartFile.class) ? String.class : field.getType());
                    Object value = this.ClassRequestModel.getMethod(this.fieldMapping.get(name).get("getterRequestModel")).invoke(instance);
                    if(value instanceof MultipartFile) {
                        value = this.fileUploadUtil.saveFile(((MultipartFile) value).getOriginalFilename(), (MultipartFile) value);
                    }
                    setter.invoke(modelInstance, value);
                } catch (Exception e) {
                    System.out.println(field.getName());
                    throw new RuntimeException(e);
                }
            }
        });
        return modelInstance;
    }
    @Override
    public T create(TRequestModel instance) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T modelInstance =   this.ClassModel.getDeclaredConstructor().newInstance();
        modelInstance = this.setValuesToInstance(modelInstance, instance);
        return this.repository.save(modelInstance);
    }

    @Override
    public T update(PrimaryType id, T instance) {
        return null;
    }
}
