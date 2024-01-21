package com.ecommerce.ecommerce.services.interfaces;

import javax.management.InstanceNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface IAbstractService<T, TypePrimaryKey> {
    public List<T> list();
    public T retrieve(TypePrimaryKey id) throws InstanceNotFoundException;

    public void delete(TypePrimaryKey id) throws InstanceNotFoundException;
}
