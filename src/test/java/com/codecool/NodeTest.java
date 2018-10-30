package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private Node node = createNode(5);

    @Test
    void returnsValidNodesWithValues_getSiblingNodesInvoked() {
        Node left = createNode(3);
        Node right = createNode(1);
        node.setLeft(left);
        node.setRight(right);

        Node[] expected = {left, right};
        Node[] actual = node.getSiblingNodes();

        assertArrayEquals(expected, actual);
    }

    @Test
    void throwsException_when_nodeHasMaxChildren_setChildInvoked() {
        Node left = createNode(3);
        Node right = createNode(1);
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
        Node child = createNode(5);
        node.addChild(child);

        assertFalse(node.isLeaf());
    }

    @Test
    void returnsFalse_when_nodeHasManyChildren() {
        Node left = createNode(3);
        Node right = createNode(31);
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
        Node target = createNode(100);
        node.swap(target);

        int expected = 100;
        int actual = node.getValue();

        assertEquals(expected, actual);
    }

    private Node createNode(int value) {
        return new Node(value);
    }

}