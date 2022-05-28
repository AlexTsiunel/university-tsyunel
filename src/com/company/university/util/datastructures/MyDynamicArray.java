package com.company.university.util.datastructures;

public class MyDynamicArray implements DynamicArray {
    private Object[] box;
    private int capañity = 10;
    private int firstFreeIndex = 0;

    public MyDynamicArray() {
        super();
        this.box = new Object[capañity];
    }

    @Override
    public int size() {
        return firstFreeIndex;
    }

    @Override
    public boolean add(Object obj) {
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
    public boolean remove(Object obj) {
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
    public boolean contains(Object obj) {
        for (int index = 0; index < firstFreeIndex; index++) {
            if (obj.equals(box[index])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(int index) {
        return box[index];
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
}
