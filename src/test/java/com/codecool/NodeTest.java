package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void returnsValidNodesWithValues_getSiblingNodesInvoked() {
        Node node = new Node(5, null);
        Node left = new Node(3, node);
        Node right = new Node(1, node);
        node.setLeft(left);
        node.setRight(right);

        Node[] expected = {left, right};
        Node[] actual = node.getSiblingNodes();

        assertArrayEquals(expected, actual);
    }

    @Test
    void returnsTrue_when_nodeHasNoChildren() {
        Node node = new Node(3, null);

        assertTrue(node.isLeaf());
    }

    @Test
    void returnsFalse_when_nodeHasOneChild() {
        Node node = new Node(3, null);
        Node child = new Node(5, node);

        assertFalse(node.isLeaf());
    }

}