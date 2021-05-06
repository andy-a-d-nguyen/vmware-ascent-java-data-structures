package test;

import datastructures.Queue;
import datastructures.Node;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTests {

    Queue queue = new Queue();

    @Test
    void isEmptyTest() {

        assertTrue(queue.isEmpty(), "should be empty");
    }

    @Test
    void peekTest() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        queue.add(node1);
        queue.add(node2);

        assertEquals(1,queue.peek().value, "should return value of the head");
    }

    @Test
    void addTest() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        queue.add(node1);
        queue.add(node2);
        queue.add(node3);

        assertEquals(3, queue.getTail().value, "should add items to back of " +
                "queue");
    }

    @Test
    void removeTest() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        queue.add(node1);
        queue.add(node2);
        queue.add(node3);
        Node removedNode = queue.remove();

        assertEquals(1, removedNode.value, "should return removed node");
    }
}
