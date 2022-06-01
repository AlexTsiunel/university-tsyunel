package com.company.university.util.datastructures;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private int size = 0;
    private Node<T> head;
    private Node<T> tail;

    public boolean isEmpty() {
        return head == null;
    }

    public T get(int index) {

        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    public void add(int index, T item) {

        checkPositionIndex(index);

        Node<T> newNode = new Node<>();
        newNode.data = item;
        newNode.index = index;

        if (index == 0 && size == 0) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        if (index == 0 && size != 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        if (index == size) {
            tail.next = newNode;
            tail = newNode;
            size++;
            return;
        }

        Node<T> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }

        newNode.next = node.next;
        node.next = newNode;
        node = newNode;

        for (int i = index; i < size; i++) {
            node = node.next;
            node.index++;
        }
        size++;
    }

    public void add(T item) {
        Node<T> newNode = new Node<>();
        newNode.data = item;

        if (isEmpty()) {
            newNode.index = 1;
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.index = tail.index + 1;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    // !!!THE METHOD GIVES AN ERROR WHEN DELETING THE LAST ELEMENT!!!!
    // IN DEVELOPMENT!!!
    public void remove(T item) {

        if (head.data.equals(item)) {
            head = head.next;
            size--;
            for (Node<T> x = head; x != null; x = x.next) {
                x.index--;
            }
            return;
        }

        for (Node<T> x = head.next; x != null; x = x.next) {
            if (x.data.equals(item)) {
                remove(x.index);
            }
        }
    }

    public void remove(int indexRemoveItem) {
        for (Node<T> x = head.next; x != null; x = x.next) {
            if (x.index == indexRemoveItem - 1) {
                Node node = x.next.next;
                x.next = node;
                for (Node<T> y = node.next; y != null; y = y.next) {
                    y.index--;
                }

                size--;
                return;
            }
        }
    }

    public boolean contains(T item) {
        for (Node<T> x = head.next; x != null; x = x.next) {
            if (x.data.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            array[i] = node.data;
            node = node.next;
        }
        return array;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }

        };
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, size));
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private static class Node<T> {
        int index;
        T data;
        Node<T> next;
    }
}
