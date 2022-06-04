package com.company.university.util.datastructures;

import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {

    private int size = 0;
    private Node<T> head;
    private Node<T> tail;

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T element) {
        Node newNode = new Node();
        newNode.data = element;
        if (isEmpty()) {
            return addElementIntoEmptyList(newNode);
            
        } else {
            return addLastElement(newNode);
        }
    }

    public void add(int index, T element) {
        checkPositionIndex(index);
        Node newNode = new Node();
        newNode.data = element;
        newNode.index = index;
        if (index == 0) {
            if (isEmpty()) {
                addFirstElement(newNode);
            }

        } else if (index == size) {
            addLastElement(newNode);
        } else {
            addIntermediateElement(newNode, index);
        }
    }

    @Override
    public boolean remove(T element) {
        if (head.data.equals(element)) {
            return removeFirstElement();

        } else if (tail.data == element) {
            return removeLastElement();
        } else {

            for (Node<T> currentNode = head; currentNode != null; currentNode = currentNode.next) {
                if (currentNode.data.equals(element)) {
                    return removeIntermediateElement(currentNode);
                }
            }
        }
        return false;
    }

    public void remove(int index) {
        checkPositionIndex(index);
        if (index == 0) {
            removeFirstElement();
        } else if (index == size - 1) {
            removeLastElement();
        } else {
            for (Node<T> currentNode = head; currentNode != null; currentNode = currentNode.next) {
                if (currentNode.index == index) {
                    removeIntermediateElement(currentNode);
                    return;
                }
            }
        }
    }

    @Override
    public boolean contains(T element) {
        for (Node<T> currentNode = head; currentNode != null; currentNode = currentNode.next) {
            if (currentNode.data.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, size));
        }
        T result = null;
        for (Node<T> x = head; x != null; x = x.next) {
            if (x.index == index) {
                result = x.data;
            }
        }
        return result;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            array[i] = node.data;
            node = node.next;
        }
        return array;
    }

    private boolean removeFirstElement() {
        if (head.next != null) {
            head.next.previous = null;
        }
        head = head.next;
        for (Node<T> currentNode = head; currentNode != null; currentNode = currentNode.next) {
            currentNode.index--;
        }
        size--;
        return true;
    }

    private boolean removeIntermediateElement(Node node) {
        for (Node<T> currentNode = node.next; currentNode != null; currentNode = currentNode.next) {
            currentNode.index--;
        }
        node.previous.next = node.next;
        node.next.previous = node.previous;
        node = null;
        size--;
        return true;
    }

    private boolean removeLastElement() {
        if (tail.previous != null) {
            tail.previous.next = null;
        }
        tail = tail.previous;
        size--;
        return true;
    }

    private boolean addElementIntoEmptyList(Node node) {
        if (isEmpty()) {
            node.index = 0;
            head = node;
            tail = node;
            size++;
            return true;
        }
        return false;
    }

    private boolean addFirstElement(Node node) {
        if (isEmpty()) {
            addElementIntoEmptyList(node);
        } else {
            node.index = 0;
            head.previous = node;
            node.next = head;
            head = node;
            size++;
            for (Node<T> currentNode = head.next; currentNode != null; currentNode = currentNode.next) {
                currentNode.index++;
            }
        }
        return true;
    }

    private boolean addIntermediateElement(Node node, int index) {
        if (index > 0 && index < size - 1) {
            for (Node<T> currentNode = head.next; currentNode != null; currentNode = currentNode.next) {
                if (currentNode.index == index) {
                    node.previous = currentNode.previous;
                    node.next = currentNode;
                    currentNode.previous.next = node;
                    currentNode.previous = node;
                }
            }
            increaseNextElementsIndex(node);
            size++;
            return true;
        }
        return false;
    }

    private boolean addLastElement(Node node) {
        node.index = tail.index + 1;
        tail.next = node;
        node.previous = tail;
        tail = node;
        size++;
        return true;
    }

    private void increaseNextElementsIndex(Node node) {
        for (Node<T> currentNode = node.next; currentNode != null; currentNode = currentNode.next) {
            currentNode.index++;
        }
    }

    private void reduceNextElementsIndex(Node node) {
        for (Node<T> currentNode = node.next; currentNode != null; currentNode = currentNode.next) {
            currentNode.index--;
        }
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
        Node<T> previous;
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

}
