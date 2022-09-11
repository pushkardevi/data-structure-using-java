package ApnaCollege;

public class CircularQueueUsingArray {

    private static class Queue {

        private static int[] arr;
        private static int size;
        private static int rear = -1;
        private static int front = -1;

        Queue(int size) {
            arr = new int[size];
            Queue.size = size;
        }


        private static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        private static boolean isFull() {
            return (rear + 1) % size == front;
        }

        private static void add(int data) {
            if (isFull()) {
                System.out.print("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        private static int remove() {

            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                return rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        private static int peek() {

            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }


    public static void main(String[] args) {
        // Queue.size = 3;
        Queue queue = new Queue(5);
        Queue.add(10);
        Queue.add(20);
        Queue.add(30);
        Queue.add(40);
        Queue.add(50);
        System.out.println("Remove: "+ Queue.remove());
        Queue.add(60);
        System.out.println("Remove: "+ Queue.remove());
        Queue.add(70);
        //queue.remove()
        while (!Queue.isEmpty()) {
            System.out.print(Queue.peek() + "-->");
            Queue.remove();
        }
    }
}