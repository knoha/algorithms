package com.knoha.demo.ds.impl.list;

import com.knoha.demo.ds.spi.List;
import org.junit.Before;
import org.junit.Test;

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