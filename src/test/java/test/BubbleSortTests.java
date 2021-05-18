package test;

import datastructures.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static algorithms.BubbleSort.bubbleSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTests {

    @Test
    void mergeSortTest() {
        List<Node> list = new ArrayList<>();
        list.add(new Node(6));
        list.add(new Node(3));
        list.add(new Node(5));
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(4));

        Node[] actual = new Node[list.size()];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = list.get(i);
        }
        bubbleSort(actual);

        assertEquals(1, actual[0].value, "should sort in numerical order");
        assertEquals(2, actual[1].value, "should sort in numerical order");
        assertEquals(6, actual[5].value, "should sort in numerical order");
    }
}
