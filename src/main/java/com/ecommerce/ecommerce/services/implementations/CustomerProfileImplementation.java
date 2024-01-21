package com.ecommerce.ecommerce.services.implementations;

import com.ecommerce.ecommerce.models.entities.CustomerProfile;
import com.ecommerce.ecommerce.models.entities.User;
import com.ecommerce.ecommerce.models.repositories.CustomerProfileRepository;
import com.ecommerce.ecommerce.models.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.InstanceNotFoundException;

@Service
public class CustomerProfileImplementation extends AbstractFormDataFormDataService<User, User, String> {
    private final CustomerProfileRepository customerProfileRepository;

    @Autowired
    public CustomerProfileImplementation(UserRepository repository, CustomerProfileRepository customerProfileRepository) {
        this.repository = repository;
        this.customerProfileRepository = customerProfileRepository;
    }

    public CustomerProfile updateProfile(String id, CustomerProfile customerProfile) throws InstanceNotFoundException {
        CustomerProfile user = this.retrieve(id).getClient();
        user.setFirstname(customerProfile.getFirstname());
        user.setLastname(customerProfile.getLastname());
        user.setPhone(customerProfile.getPhone());
        return customerProfileRepository.save(user);
    }
}
