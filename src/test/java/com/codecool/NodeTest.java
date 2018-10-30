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
        node.addChild(left);
        node.addChild(right);

        assertThrows(IllegalStateException.class, () -> {
            node.addChild(left);
        });
    }

    @Test
    void returnsTrue_when_nodeHasNoChildren() {
        assertTrue(node.isLeaf());
    }

    @Test
    void returnsFalse_when_nodeHasOneChild() {
        Node child = new Node(5, node);
        node.addChild(child);

        assertFalse(node.isLeaf());
    }

    @Test
    void returnsFalse_when_nodeHasManyChildren() {
        Node left = new Node(3, node);
        Node right = new Node(31, node);
        node.addChild(left);
        node.addChild(right);

        assertFalse(node.isLeaf());
    }

    @Test
    void throwsException_when_AnyNodeIsNull_swapInvoked() {
        assertThrows(IllegalArgumentException.class, () -> {
            node.swap(null);
        });
    }

    @Test
    void haveRightValues_after_swap() {
        Node target = new Node(100, null);
        node.swap(target);

        int expected = 100;
        int actual = node.getValue();

        assertEquals(expected, actual);
    }

}