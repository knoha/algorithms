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

    public T get(int index) {
        return null;
    }

    public void add(T e) {
        
    }

    public void add(T e, int index) {

    }

    public void set(T e, int index) {

    }

    public void remove(int index) {

    }

    public void remove(T e) {

    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return 0;
    }

    public int indexOf(T e) {
        return 0;
    }

    private final class Node<E> {

        private Node<E> prev;
        private Node<E> next;

        private E object;

    }
}
