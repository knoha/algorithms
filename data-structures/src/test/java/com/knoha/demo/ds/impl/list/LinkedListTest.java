package com.knoha.demo.ds.impl.list;

import com.knoha.demo.ds.spi.List;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Kostiantyn Noha
 */
public class LinkedListTest {

    private List<String> strings;

    @Before
    public void setUp() throws Exception {
        strings = new LinkedList<>();
        assertTrue(strings.isEmpty());
        assertEquals(0, strings.size());
    }

    @Test
    public void testGet() throws Exception {
        final String s1 = UUID.randomUUID().toString();
        strings.add(s1);
        assertEquals(s1, strings.get(0));
        assertEquals(1, strings.size());

        final String s2 = UUID.randomUUID().toString();
        strings.add(s2);
        assertEquals(s1, strings.get(0));
        assertEquals(s2, strings.get(1));
        assertEquals(2, strings.size());

        final String s3 = UUID.randomUUID().toString();
        strings.add(s3);
        assertEquals(s1, strings.get(0));
        assertEquals(s2, strings.get(1));
        assertEquals(s3, strings.get(2));
        assertEquals(3, strings.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_EmptyList() throws Exception {
        strings.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_NegativeIndex() throws Exception {
        strings.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_IndexGreaterSize() throws Exception {
        strings.get(10);
    }

    @Test
    public void testAdd_Object() throws Exception {

    }

    @Test
    public void testAdd_ToIndex() throws Exception {

    }

    @Test
    public void testSet() throws Exception {

    }

    @Test
    public void testRemove_Object() throws Exception {

    }

    @Test
    public void testRemove_ByIndex() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {

    }

    @Test
    public void testSize() throws Exception {

    }

    @Test
    public void testIndexOf() throws Exception {

    }
}