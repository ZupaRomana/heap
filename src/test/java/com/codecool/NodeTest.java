package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private Node node = new Node(5, null);

    @Test
    void returnsValidNodesWithValues_getSiblingNodesInvoked() {
        Node left = new Node(3, node);
        Node right = new Node(1, node);
        node.setLeft(left);
        node.setRight(right);

        Node[] expected = {left, right};
        Node[] actual = node.getSiblingNodes();

        assertArrayEquals(expected, actual);
    }

    @Test
    void throwsException_when_nodeHasMaxChildren_setChildInvoked() {
        Node left = new Node(3, node);
        Node right = new Node(1, node);
        node.setChild(left);
        node.setChild(right);

        assertThrows(IllegalStateException.class, () -> {
            node.setChild(left);
        });
    }

    @Test
    void returnsTrue_when_nodeHasNoChildren() {
        assertTrue(node.isLeaf());
    }

    @Test
    void returnsFalse_when_nodeHasOneChild() {
        Node child = new Node(5, node);
        node.setChild(child);

        assertFalse(node.isLeaf());
    }

    @Test
    void returnsFalse_when_nodeHasManyChildren() {
        Node left = new Node(3, node);
        Node right = new Node(31, node);
        node.setChild(left);
        node.setChild(right);

        assertFalse(node.isLeaf());
    }

}