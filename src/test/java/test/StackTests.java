package test;

import datastructures.Stack;
import datastructures.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StackTests {

    Stack stack = new Stack();

    @Test
    void isEmptyTest() {
        assertTrue(stack.isEmpty(), "should be empty");
    }

    @Test
    void peekTest() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        stack.push(node1);
        stack.push(node2);

        assertEquals(2, stack.peek().value, "should return the top item in " +
                "the stack");
    }

    @Test
    void pushTest() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        stack.push(node1);
        stack.push(node2);

        assertEquals(1, stack.peek().next.value, "should push items on top of" +
                " the stack");
    }

    @Test
    void popTest() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        stack.push(node1);
        stack.push(node2);
        Node poppedNode = stack.pop();

        assertEquals(2, poppedNode.value, "should remove the top item in the " +
                "stack");
    }
}
