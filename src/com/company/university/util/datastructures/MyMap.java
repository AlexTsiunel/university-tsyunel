package com.company.university.util.datastructures;

public interface MyMap<K, V> extends Iterable<V> {
    boolean insert(K key, V value);

    boolean delete(K key);

    V get(K key);

    int size();
}
