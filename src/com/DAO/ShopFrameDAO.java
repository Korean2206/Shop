package com.DAO;

import java.util.List;

public abstract class ShopFrameDAO <E,K> {
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void delete(E entity,K key);
    abstract public List<E> selectAll();
    abstract public E selectByID(K key);
    abstract public List<E> selectBySQL(String sql, Object... args);
}
