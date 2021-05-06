package datastructures;

public class Stack {

    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public Node peek() throws NullPointerException {
        if (head == null) {
            throw new NullPointerException("Stack is empty");
        }
        return head;
    }

    public void push(Node node) {
        node.next = head;
        head = node;
    }

    public Node pop() throws NullPointerException {
        if (head == null) {
            throw new NullPointerException("Stack is empty");
        }
        Node poppedNode = head;
        head = head.next;
        return poppedNode;
    }
}
