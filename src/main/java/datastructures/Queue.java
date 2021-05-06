package datastructures;

public class Queue {

    private Node head;
    private Node tail;

    public Node getTail() {
        return tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node peek() throws NullPointerException {
        if (head == null) {
            throw new NullPointerException("Queue is empty");
        }
        return head;
    }

    public void add(Node node) {
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public Node remove() throws NullPointerException {
        if (head == null) {
            tail = null;
            throw new NullPointerException("Queue is empty");
        }
        Node removedNode = head;
        head = head.next;
        return removedNode;
    }
}
