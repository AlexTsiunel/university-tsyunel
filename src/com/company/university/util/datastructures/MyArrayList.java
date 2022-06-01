package com.company.university.util.datastructures;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private Object[] box;
    private int capañity = 10;
    private int firstFreeIndex = 0;

    public MyArrayList() {
        super();
        this.box = new Object[capañity];
    }

    @Override
    public int size() {
        return firstFreeIndex;
    }

    @Override
    public boolean add(T obj) {
        if (firstFreeIndex == box.length) {
            int newCapacity = (int) (capañity * 1.5);
            Object[] newBox = new Object[newCapacity];
            for (int i = 0; i < box.length; i++) {
                newBox[i] = box[i];
            }
            capañity = newCapacity;
            box = newBox;
        }

        box[firstFreeIndex] = obj;
        firstFreeIndex++;
        return true;
    }

    @Override
    public boolean remove(T obj) {
        if (obj == null) {
            for (int index = 0; index < firstFreeIndex; index++) {
                if (box[index] == null) {
                    fastRemove(index);
                    firstFreeIndex--;
                    return true;
                }
            }

        } else {
            for (int index = 0; index < firstFreeIndex; index++) {
                if (obj.equals(box[index])) {
                    fastRemove(index);
                    firstFreeIndex--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean contains(T obj) {
        for (int index = 0; index < firstFreeIndex; index++) {
            if (obj.equals(box[index])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        checkPositionIndex(index);
        return (T) box[index];
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[firstFreeIndex - 1];
        for (int index = 0; index < (firstFreeIndex - 1); index++) {
            array[index] = box[index];
        }
        return array;
    }

    private void fastRemove(int index) {
        for (int i = index + 1; i <= firstFreeIndex; i++) {
            box[i - 1] = box[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index;

            @Override
            public boolean hasNext() {
                boolean result = false;
                if (index >= 0 && index < firstFreeIndex) {
                  result = true;
              }
              return result;
            }

            @Override
            public T next() {
                return (T) box[index++];
            }
        };
    }
    
    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, firstFreeIndex));
    }
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= firstFreeIndex;
    }
}
