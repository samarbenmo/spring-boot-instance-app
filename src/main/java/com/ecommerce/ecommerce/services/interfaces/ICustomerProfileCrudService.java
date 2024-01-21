package com.ecommerce.ecommerce.services.interfaces;

import com.ecommerce.ecommerce.models.entities.CustomerProfile;
import com.ecommerce.ecommerce.models.entities.User;

import java.util.List;

public interface ICustomerProfileCrudService {
    public List<User> list();
    public User retrieve(String id);
    public CustomerProfile updateProfile(String id, CustomerProfile customerProfile);
    public void delete(String id);
}
