package com.codecool;

import java.util.NoSuchElementException;

public class HeapMax {

    private int size;
    private Integer[] nodes;
    private Integer root;

    public HeapMax() {
        size = 0;
        nodes = new Integer[size];
        root = null;
    }

    public Integer getRoot() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return root;
        }
    }
    public void setRoot(int root) {
        this.root = root;
    }

    public void add(int value) {
        if (root == null) {
            initializeRoot(value);
        }
        addToNodes(value);
    }

    private void increaseSize() {
        size++;
    }

    private void addToNodes(Integer node) {
        extendArray();
        nodes[size - 1] = node;
    }

    private void extendArray() {
        Integer[] newArr = new Integer[size + 1];
        for (int i = 0; i < size; i++) {
            newArr[i] = nodes[i];
        }
        nodes = newArr;
        increaseSize();
    }

    private void initializeRoot(Integer root) {
        setRoot(root);
    }

}
