package com.codecool;

import java.util.NoSuchElementException;

public class HeapMin {

    private Node root;
    private Node[] nodes;
    private int size;

    public HeapMin() {
        this.root = null;
        this.nodes = null;
        this.size = 0;
    }

    public void add(int i) {
    }

    public Node getRoot() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return root;
        }
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node[] getNodes() {
        return nodes;
    }

    public void setNodes(Node[] nodes) {
        this.nodes = nodes;
    }
}
