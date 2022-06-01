package com.company.university.util.datastructures;

public interface DynamicArray<T> {
    int size();

    boolean add(T obj);

    boolean remove(T obj);

    boolean contains(T obj);

    T get(int index);

    Object[] toArray();
}
