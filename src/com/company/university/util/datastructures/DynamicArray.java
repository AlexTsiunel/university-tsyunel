package com.company.university.util.datastructures;

public interface DynamicArray {
    int size();

    boolean add(Object obj);

    boolean remove(Object obj);

    boolean contains(Object obj);

    Object get(int index);

    Object[] toArray();
}
