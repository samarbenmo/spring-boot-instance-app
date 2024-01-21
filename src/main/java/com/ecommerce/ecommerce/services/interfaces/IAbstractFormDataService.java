package com.ecommerce.ecommerce.services.interfaces;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface IAbstractFormDataService<T, TRequestModel, PrimaryKeyType> extends IAbstractService<T, PrimaryKeyType>{
    public T create(TRequestModel instance) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
    public T update(PrimaryKeyType id, T instance);
}
