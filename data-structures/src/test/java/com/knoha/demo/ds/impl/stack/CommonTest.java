package com.knoha.demo.ds.impl.stack;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.Stack;
import java.util.UUID;

/**
 * TODO add a stask linked list implementation
 *
 * @author Kostiantyn Noha
 */
public class CommonTest {

    @Test
    public void testStackDataStructure() {
        final Stack<String> javaStack = new Stack<>();
        final StackArray<String> stack = new StackArray<>();
        final String testString = UUID.randomUUID().toString();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            javaStack.push(testString);
        }
        printAddTime("java.util.Stack", start, javaStack.size());

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            stack.push(testString);
        }
        printAddTime("StackArray", start, stack.size());

        start = System.currentTimeMillis();
        int initialSize = javaStack.size();
        for (int i = initialSize; i > 0; i--) {
            javaStack.pop();
        }
        printPopTime("java.util.Stack", start, initialSize);

        start = System.currentTimeMillis();
        initialSize = stack.size();
        for (int i = initialSize; i > 0; i--) {
            stack.pop();
        }
        printPopTime("StackArray", start, initialSize);
    }

    private void printAddTime(final String collectionName, final long startTime, final int collectionSize) {
        System.out.println(
                MessageFormat.format("Adding {0} strings to {1}: {2} ms.",
                        collectionSize, collectionName, System.currentTimeMillis() - startTime));
    }

    private void printPopTime(final String collectionName, final long startTime, final int collectionSize) {
        System.out.println(
                MessageFormat.format("Popping {0} strings to {1}: {2} ms.",
                        collectionSize, collectionName, System.currentTimeMillis() - startTime));
    }

}
