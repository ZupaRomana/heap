package com.codecool;

public class Node {

    private int value;
    private Node parent;
    private Node left;
    private Node right;

    public Node(int value, Node parent) {
        this.value = value;
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    // Wont work with generics
    public Node[] getSiblingNodes() {
        return new Node[]{this.left, this.right};
    }

    public boolean isLeaf() {
        return !(hasLeft() && hasRight());
    }

    public boolean hasRight() {
        return this.right != null;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public void addChild(Node child) throws IllegalStateException {

    }
}
