package test;

import datastructures.JavaLinkedList;
import datastructures.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTests {

    @Test
    void defaultNodeTest() {
        // setup
        int val = 0;
        Object next = null;

        // execution
        Node actual = new Node();
        // assertion
        assertEquals(val, actual.value);
        assertEquals(next, actual.next);
    }

    @Test
    void nonEmptyNodeTest() {
        Node actual = new Node(2);

        int expectedValue = 2;
        Object expectedNext = null;

        assertEquals(expectedValue, actual.value);
        assertEquals(expectedNext, actual.next);
    }

    @Test
    void isEmptyTest() {
        // initialize a linked list
        JavaLinkedList list = new JavaLinkedList();

        // check if list is empty
        boolean isEmpty = list.isEmpty();

        // expected result
        boolean expected = true;

        // assert
        assertEquals(expected, isEmpty);
    }

    @Test
    void setNextTest() {
        Node actual = new Node(2, new Node(1));

        int value = 1;

        assertEquals(value, actual.next.value);
    }

    @Test
    void addObjectTest() {
        // initialize a linked list
        JavaLinkedList linkedList = new JavaLinkedList();

        // add nodes to linked list
        Node node = new Node(2);
        linkedList.add(node);

        Node expected = new Node(2, null);

        assertEquals(expected.value, linkedList.getHead().value);

    }

    @Test
    void addMultipleObjectTest() {
        // initialize a linked list
        JavaLinkedList linkedList = new JavaLinkedList();

        // add nodes to linked list
        Node node = new Node(2);
        Node node2 = new Node(3);
        linkedList.add(node);
        linkedList.add(node2);

        Node expected = new Node(3, null);

        assertEquals(expected.value, linkedList.getHead().next.value);

    }

    @Test
    void addFirstTest() {
        JavaLinkedList linkedList = new JavaLinkedList();

        Node node1 = new Node(2);
        Node node2 = new Node(4);

        linkedList.add(node1);
        linkedList.addFirst(node2);

        int expectedHeadVal = 4;

        assertEquals(expectedHeadVal, linkedList.getHead().value);
    }

    @Test
    void addLastTest() {
        // initialize a linked list
        JavaLinkedList linkedList = new JavaLinkedList();

        // add nodes to linked list
        Node node = new Node(2);
        Node node2 = new Node(3);
        linkedList.add(node);
        linkedList.addLast(node2);

        Node expected = new Node(3, null);

        assertEquals(expected.value, linkedList.getHead().next.value);
    }

    @Test
    void removeTest() {
        // initialize a linked list
        JavaLinkedList linkedList = new JavaLinkedList();

        // add nodes to linked list
        Node node = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);

        linkedList.add(node);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.remove(node2);

        Node expected = new Node(4);

        assertEquals(expected.value, linkedList.getHead().next.value);
    }

    @Test
    void removeTest_noHead() {
        // initialize a linked list
        JavaLinkedList linkedList = new JavaLinkedList();

        // add nodes to linked list
        Node node = new Node(2);

        linkedList.add(node);
        linkedList.remove(node);

        Node expected = null;

        assertEquals(expected, linkedList.getHead());
    }
}
