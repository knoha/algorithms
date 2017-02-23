package com.knoha.demo.ds.spi;

/**
 * @author Kostiantyn Noha
 */
public interface List<T> {

    T get(int index);

    void add(T e);

    void add(T e, int index);

    void set(T e, int index);

    void remove(int index);

    void remove(T e);

    boolean isEmpty();

    int size();

    int indexOf(T e);

}
