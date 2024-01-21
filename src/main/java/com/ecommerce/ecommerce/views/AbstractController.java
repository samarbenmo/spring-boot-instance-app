package com.ecommerce.ecommerce.views;

import com.ecommerce.ecommerce.services.implementations.AbstractFormDataFormDataService;
import com.ecommerce.ecommerce.services.utils.FileUploadUtil;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

public class AbstractController<T, TRequestModel, PrimaryKeyType> {
    protected AbstractFormDataFormDataService<T, TRequestModel, PrimaryKeyType> service;
    protected FileUploadUtil fileUploadUtil;
    protected HashMap<String, HashMap<String, String>> fileMappings;

    @RequestMapping(method = RequestMethod.GET, path = "")
    public List<T> list() {
        return this.service.list();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public T create(TRequestModel model) throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return this.service.create(model);
    }
}
