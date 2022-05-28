package com.company.university.util.datastructures;

public interface DynamicArray {
    int size(); //возвращает количество элементов в структуре
    boolean add(Object obj); //добавл€ет в структуру указанный объект
    boolean remove(Object obj); //удал€ет из структуры указанный объект
    boolean contains(Object obj); //провер€ет наличие объекта в структуре
    Object get(int index); //возвращает элемент из структуры с соответствующим пор€дковым номером
    Object[] toArray(); //возвращает массив с объектами вход€щими в структуру (без пустых €чеек)


}
