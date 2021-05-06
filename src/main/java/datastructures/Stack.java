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
        node.next = head; // point node's next to the old head
        head = node; // set node as new head
    }

    public Node pop() throws NullPointerException {
        if (head == null) {
            throw new NullPointerException("Stack is empty");
        }
        var poppedNode = head;
        head = head.next;
        return poppedNode;
    }
}
