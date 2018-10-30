package com.codecool;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class HeapMinTest {

    private HeapMin heap = new HeapMin();

    @Test
    void throwsException_when_noElements_getRootInvoked() {
        assertThrows(NoSuchElementException.class, () -> {
            heap.getRoot();
        });
    }

}