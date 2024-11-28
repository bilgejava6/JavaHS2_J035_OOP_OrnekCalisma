package com.muhammet.repository;

public interface Repository<T>{
    void save(T t);
    void update(T t);
    void delete(String uuid);
    T findById(String uuid);
    T[] findAll();
}
