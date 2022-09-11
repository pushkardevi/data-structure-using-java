package Queue;

public class Runner {

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(8);
		
		q.deQueue();
		q.deQueue();
		
		q.enQueue(12);
		q.enQueue(13);
		q.enQueue(14);
		q.enQueue(16);
		
		System.out.println(q.isFull());
		System.out.println(q.getSize());
		
		q.show();
		
	}

}
