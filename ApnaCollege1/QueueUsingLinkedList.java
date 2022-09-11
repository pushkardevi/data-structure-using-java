package ApnaCollege;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + "-->");
            queue.remove();
        }
    }
}
