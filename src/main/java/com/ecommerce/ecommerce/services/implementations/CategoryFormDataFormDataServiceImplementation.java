package com.ecommerce.ecommerce.services.implementations;

import com.ecommerce.ecommerce.models.entities.Category;
import com.ecommerce.ecommerce.models.repositories.CategoryRepository;
import com.ecommerce.ecommerce.services.utils.FileUploadUtil;
import com.ecommerce.ecommerce.views.request_models.CategoryRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class CategoryFormDataFormDataServiceImplementation extends AbstractFormDataFormDataService<Category, CategoryRequestModel, String> {
    @Autowired
    CategoryFormDataFormDataServiceImplementation(CategoryRepository repository, FileUploadUtil fileUploadUtil){
        this.ClassModel = Category.class;
        this.repository = repository;
        this.fileUploadUtil = fileUploadUtil;
        this.ClassRequestModel = CategoryRequestModel.class;
        this.fieldMapping = new HashMap<>();

        // map the
        HashMap<String, String> titleHasMap = new HashMap<>();
        titleHasMap.putIfAbsent("getter", "getTitle");
        titleHasMap.putIfAbsent("setter", "setTitle");
        titleHasMap.putIfAbsent("getterRequestModel", "getTitle");
        this.fieldMapping.putIfAbsent("title", titleHasMap);

        // map the content attributes
        HashMap<String, String> contentHasMap = new HashMap<>();
        contentHasMap.putIfAbsent("getter", "getContent");
        contentHasMap.putIfAbsent("setter", "setContent");
        contentHasMap.putIfAbsent("getterRequestModel", "getContent");
        this.fieldMapping.putIfAbsent("content", contentHasMap);

        // map the citation field
        HashMap<String, String> citationHashMap = new HashMap<>();
        citationHashMap.putIfAbsent("getter", "getCitation");
        citationHashMap.putIfAbsent("setter", "setCitation");
        citationHashMap.putIfAbsent("getterRequestModel", "getCitation");
        this.fieldMapping.putIfAbsent("citation", citationHashMap);

        // map the image field
        HashMap<String, String> imageHashMap = new HashMap<>();
        imageHashMap.putIfAbsent("getter", "getImage");
        imageHashMap.putIfAbsent("setter", "setImage");
        imageHashMap.putIfAbsent("getterRequestModel", "getImage");
        this.fieldMapping.putIfAbsent("image", imageHashMap);
    }
}
