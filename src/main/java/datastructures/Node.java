package datastructures;

public class Node {
    public Node next;
    public int value = 0;

    public Node() {}

    public Node(int value) {
        this.value = value;
    }
    
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
