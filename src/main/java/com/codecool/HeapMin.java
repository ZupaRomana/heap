package com.codecool;

import java.util.NoSuchElementException;

public class HeapMin {

    private Node root;
    private Node[] nodes;
    private int size;

    public HeapMin() {
        this.root = null;
        this.size = 0;
        this.nodes = new Node[size];
    }

    public void add(int value) {
        Node node = createNode(value);
        addToNodes(node);
        if (root == null) {
            initializeRoot(node);
        }
    }

    private void increaseSize() {
        size++;
    }

    private void addToNodes(Node node) {
        extendArray();
        nodes[size - 1] = node;
    }

    private void extendArray() {
        Node[] newArr = new Node[size + 1];
        for (int i = 0; i < size; i++) {
            newArr[i] = nodes[i];
        }
        nodes = newArr;
        increaseSize();
    }

    private Node createNode(int value) {
        return new Node(value);
    }

    private void initializeRoot(Node root) {
        setRoot(root);
    }

    private Node getRoot() throws NoSuchElementException {
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            return root;
        }
    }

    public int getRootValue() {
        return getRoot().getValue();
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
