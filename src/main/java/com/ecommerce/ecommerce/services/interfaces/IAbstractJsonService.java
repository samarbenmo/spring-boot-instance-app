package com.ecommerce.ecommerce.services.interfaces;

public interface IAbstractJsonService<T, PrimaryKeyType> extends IAbstractService<T, PrimaryKeyType> {
    public T create(T instance);
    public T update(PrimaryKeyType id, T instance);
}
