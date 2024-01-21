package com.ecommerce.ecommerce.services.implementations;

import com.ecommerce.ecommerce.services.interfaces.IAbstractService;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.Optional;

public class AbstractService<T, PrimaryKeyType>  implements IAbstractService<T, PrimaryKeyType> {
    protected JpaRepository<T, PrimaryKeyType> repository;

    @Override
    public List<T> list() {
        return this.repository.findAll();
    }

    @Override
    public T retrieve(PrimaryKeyType id) throws InstanceNotFoundException {
        Optional<T> instance = this.repository.findById(id);
        if(instance.isEmpty())
        {
            throw new InstanceNotFoundException("instance not found with id = " + id);
        }
        return instance.get();
    }

    @Override
    public void delete(PrimaryKeyType id) throws InstanceNotFoundException {
        this.repository.delete(this.retrieve(id));
    }
}
