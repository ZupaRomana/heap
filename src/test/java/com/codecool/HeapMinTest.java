package com.codecool;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class HeapMinTest {

    private HeapMin heap = new HeapMin();

    @Test
    void throwsException_when_noElements_getRootInvoked() {
        assertThrows(NoSuchElementException.class, () -> {
            heap.getRootValue();
        });
    }

    @Test
    void returnsValidRoot_when_addedOneElem() {
        heap.add(5);

        int expected = 5;
        int actual = heap.getRootValue();

        assertEquals(expected, actual);
    }

}