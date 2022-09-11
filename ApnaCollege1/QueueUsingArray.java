package ApnaCollege;

import java.util.Arrays;

public class QueueUsingArray {

    private static class Queue {

        private static int[] arr;
        private static int size;
        private static int rear = -1;

        Queue(int size) {
            arr = new int[size];
            Queue.size = size;
        }


        private static boolean isEmpty() {
            return rear == -1;
        }

        private static void add(int data) {
            if (rear == size - 1) {
                System.out.print("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        private static int remove() {

            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        private static int peek() {

            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }


    public static void main(String[] args) {
        // Queue.size = 3;
        Queue queue = new Queue(3);
        queue.add(10);
        queue.add(20);
        queue.add(30);

        while (!Queue.isEmpty()) {
            System.out.print(Queue.peek() + "-->");
            Queue.remove();
        }
    }
}
