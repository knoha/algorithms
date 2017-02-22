package com.knoha.demo.ds.spi;

/**
 * Stack is an ordered list of similar data type.
 * Stack is a LIFO structure. (Last in First out).
 * <p/>
 * Stack can be easily implemented using an array or a linked list.
 * Arrays are quick, but are limited in size and linked list requires overhead to allocate, link, unlink,
 * and deallocate, but is not limited in size.
 *
 * @author Kostiantyn Noha
 * @see <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">Wiki</a>
 */
public interface Stack<T> {

    /**
     * Push an element to a stack.
     *
     * @param e an element to push
     * @return pushed element
     */
    T push(T e);

    /**
     * Remove peek element.
     *
     * @return removed peek element
     */
    T pop();

    /**
     * Simply returns a peek element if present.
     *
     * @return peek element
     */
    T top();

    /**
     * Checks whether stack is empty.
     *
     * @return true if empty
     */
    boolean isEmpty();

    /**
     * Check the number of elements in stack.
     *
     * @return a stack size
     */
    int size();

}
