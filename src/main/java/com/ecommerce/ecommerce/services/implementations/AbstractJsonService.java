package com.ecommerce.ecommerce.services.implementations;

import com.ecommerce.ecommerce.services.interfaces.IAbstractJsonService;
public class AbstractJsonService<T, PrimaryKeyType> extends AbstractService<T, PrimaryKeyType> implements IAbstractJsonService<T, PrimaryKeyType> {
    @Override
    public T create(T instance) {
        return this.repository.save(instance);
    }

    @Override
    public T update(PrimaryKeyType id, T instance) {
        return null;
    }
}
