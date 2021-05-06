package datastructures;

public class LinkedList {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }
    
    public void add(Node node) {
        Node current = head;
        if (head == null) {
            head = node;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }
    
    public void addFirst(Node node) {
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        head = node;
        head.next = temp;
    }

    public Node getHead() {
        return head;
    }
    
    public void addLast(Node node) {
        add(node);
    }
    
    public void remove(Node node) {
        if (head.next == null && head == node) {
            head = null;
            return;
        }
        Node current = head;
        Node prev = null;
        while(current != null) {
            if (current == node) {
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
        }
    }
}
