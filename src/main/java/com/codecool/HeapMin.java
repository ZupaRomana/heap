package com.codecool;

public class HeapMin {

    private Node root;
    private Node[] nodes;
    private int size;

    public HeapMin() {
        this.root = null;
        this.nodes = null;
        this.size = 0;
    }

    public void initialize(int[] array) {
        this.nodes = new Node[size];
        for (int i : array) {
            add(i);
        }
    }

    public void add(int i) {
    }

    public Node getRoot() {
        return root;
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
