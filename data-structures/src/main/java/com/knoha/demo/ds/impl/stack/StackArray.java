package com.knoha.demo.ds.impl.stack;

import com.knoha.demo.ds.spi.Stack;

/**
 * A stack implementation based on array.
 * Not thread-safe.
 *
 * @author Kostiantyn Noha
 */
public class StackArray<T> implements Stack<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] data;
    private int size;

    public StackArray() {
        this(DEFAULT_CAPACITY);
    }

    public StackArray(final int capacity) {
        data = new Object[capacity];
        size = 0;
    }

    public T push(final T e) {
        if (size + 1 == data.length) {
            final int currentLength = data.length;
            final int newLength = data.length + currentLength;

            final Object[] newData = new Object[newLength];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }

        data[size++] = e;
        return e;
    }

    public T pop() {
        if (size > 0) {
            size--;

            final Object e = data[size];
            data[size] = null;

            return cast(e);
        }

        return null;
    }

    public T top() {
        return size > 0 ? cast(data[size - 1]) : null;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private T cast(final Object e) {
        return (T) e;
    }
}
