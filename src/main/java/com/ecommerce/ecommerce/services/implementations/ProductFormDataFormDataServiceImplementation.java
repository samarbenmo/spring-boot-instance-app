package com.ecommerce.ecommerce.services.implementations;

import com.ecommerce.ecommerce.models.entities.Category;
import com.ecommerce.ecommerce.models.entities.Product;
import com.ecommerce.ecommerce.models.repositories.CategoryRepository;
import com.ecommerce.ecommerce.models.repositories.ProductRepository;
import com.ecommerce.ecommerce.services.utils.FileUploadUtil;
import com.ecommerce.ecommerce.views.request_models.ProductRequestModel;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

@Service
public class ProductFormDataFormDataServiceImplementation extends AbstractFormDataFormDataService<Product, ProductRequestModel, String> {
    private final CategoryRepository categoryRepository;
    @Autowired
    public ProductFormDataFormDataServiceImplementation(ProductRepository repository, FileUploadUtil fileUploadUtil, CategoryRepository categoryRepository) {
        this.ClassModel = Product.class;
        this.ClassRequestModel = ProductRequestModel.class;
        this.repository = repository;
        this.fileUploadUtil  = fileUploadUtil;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product create(ProductRequestModel instance) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if(instance.getCategory().getClass().equals(String.class))
        {
            Optional<Category> category = this.categoryRepository.findById(String.valueOf(instance.getCategory()));
            if(category.isEmpty())
            {
                throw new EntityNotFoundException("category with id = "  + instance.getCategory() + " not found");
            }
            category.get().setNumberPurchases(category.get().getNumberPurchases() + 1);
            categoryRepository.save(category.get());
            instance.setCategory(category.get());
        }
        return super.create(instance);
    }
}
