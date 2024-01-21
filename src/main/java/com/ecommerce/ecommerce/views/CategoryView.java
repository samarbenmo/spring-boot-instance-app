package com.ecommerce.ecommerce.views;

import com.ecommerce.ecommerce.models.entities.Category;
import com.ecommerce.ecommerce.services.implementations.CategoryFormDataFormDataServiceImplementation;
import com.ecommerce.ecommerce.views.request_models.CategoryRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryView extends AbstractController<Category, CategoryRequestModel, String> {
    @Autowired
    public CategoryView(CategoryFormDataFormDataServiceImplementation service)
    {
        this.service = service;
    }
}
