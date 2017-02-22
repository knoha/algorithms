package com.knoha.demo.ds.impl.stack;

import com.knoha.demo.ds.spi.Stack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * @author Kostiantyn Noha
 */
public class StackArrayTest {

    public static final String TEST_STRING = UUID.randomUUID().toString();

    private Stack<String> strings;

    @Before
    public void setUp() {
        strings = new StackArray<String>();

        assertEquals(0, strings.size());
        assertTrue(strings.isEmpty());
    }

    @After
    public void cleanUp() {
        strings = null;
    }

    @Test
    public void testPush() throws Exception {
        for (int i = 0; i < 1000; i++) {
            strings.push(TEST_STRING);
        }

        assertEquals(1000, strings.size());
    }

    @Test
    public void testPush_WithPop() throws Exception {
        for (int i = 0; i < 1000; i++) {
            strings.push(TEST_STRING);
        }

        assertEquals(1000, strings.size());

        for (int i = 0; i < 100; i++) {
            assertNotNull(strings.pop());
        }

        assertEquals(900, strings.size());


        for (int i = 0; i < 35; i++) {
            strings.push(TEST_STRING);
        }

        assertEquals(935, strings.size());
    }

    @Test
    public void testPop() throws Exception {
        strings.push(TEST_STRING);

        assertEquals(1, strings.size());
        assertFalse(strings.isEmpty());

        assertEquals(TEST_STRING, strings.pop());
        assertTrue(strings.isEmpty());
    }

    @Test
    public void testPop_Empty() throws Exception {
        assertNull(strings.pop());
    }

    @Test
    public void testTop() throws Exception {
        strings.push(TEST_STRING);

        assertEquals(1, strings.size());
        assertFalse(strings.isEmpty());

        assertEquals(TEST_STRING, strings.top());

        assertEquals(1, strings.size());
        assertFalse(strings.isEmpty());
    }

    @Test
    public void testTop_Empty() throws Exception {
        assertNull(strings.top());
    }
}