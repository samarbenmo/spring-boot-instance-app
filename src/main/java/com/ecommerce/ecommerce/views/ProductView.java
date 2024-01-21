package com.ecommerce.ecommerce.views;

import com.ecommerce.ecommerce.models.entities.Product;
import com.ecommerce.ecommerce.services.implementations.ProductFormDataFormDataServiceImplementation;
import com.ecommerce.ecommerce.views.request_models.ProductRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
    public class ProductView extends AbstractController<Product, ProductRequestModel, String> {
    @Autowired
    ProductView(ProductFormDataFormDataServiceImplementation service)
    {
        this.service = service;
    }
}
