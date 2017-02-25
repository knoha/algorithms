package com.knoha.demo.ds.impl.list;

import com.knoha.demo.ds.spi.List;

/**
 * @author Kostiantyn Noha
 */
public class LinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;

    private int size = 0;

    public LinkedList() {
        super();
    }

    public T get(final int index) {
        checkIndexInBounds(index);

        if (index == 0) {
            return first.getObject();
        }

        return getNode(index).getObject();
    }

    private void checkIndexInBounds(final int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index cannot be negative.");
        }
    }

    private Node<T> getNode(final int index) {
        Node<T> target = first;
        for (int i = 0; i < index; i++) {
            target = target.getNext();
        }
        return target;
    }

    public void add(final T e) {
        if (isEmpty()) {
            final Node<T> node = new Node<>(e, null, null);
            first = node;
            last = node;
        } else {
            final Node<T> newLast = new Node<>(e, last, null);
            last.setNext(newLast);
            last = newLast;
        }

        size++;
    }

    public void add(final T e, final int index) {
        checkIndexInBounds(index);

        final Node<T> currentNode = getNode(index);
        final Node<T> newNode = new Node<>(e, currentNode.getPrev(), currentNode);
        currentNode.getPrev().setNext(newNode);

        size++;
    }

    public void set(final T e, final int index) {
        checkIndexInBounds(index);

        final Node<T> node = getNode(index);
        node.setObject(e);
    }

    public void remove(final int index) {
        checkIndexInBounds(index);

        final Node<T> currentNode = getNode(index);
        if (index == 0) {
            first = currentNode;
            currentNode.setPrev(null);
        } else if (index == size) {
            last = currentNode;
            currentNode.getPrev().setNext(null);
        } else {
            final Node<T> currentPrev = currentNode.getPrev();
            final Node<T> currentNext = currentNode.getNext();
            currentNext.getPrev().setNext(currentNext);
            currentNode.getNext().setPrev(currentPrev);
        }

        size--;
    }

    public void remove(final T e) {
        final int i = indexOf(e);
        if (i > -1) {
            remove(i);
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    public int indexOf(final T e) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            final T o = current.getObject();

            if ((e == null && o == null) ||
                    (e != null && e.equals(o))) {
                return i;
            }
        }

        return -1;
    }

    private final class Node<E> {

        private Node<E> prev;
        private Node<E> next;

        private E object;

        public Node(E object, Node<E> prev, Node<E> next) {
            this.object = object;
            this.prev = prev;
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getObject() {
            return object;
        }

        public void setObject(E object) {
            this.object = object;
        }
    }
}
