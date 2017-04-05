package circularQueue;

public class RunQueue {

	public static void main(String[] args) throws QueueEmptyException {
		Queue queue = new CircularArrayQueue();
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		queue.enqueue("E");
		queue.enqueue("F");
		// queue.enqueue("G");
		// queue.enqueue("H");

		System.out.println(queue.size());

		for (int i = 0; i < 2; i++) {
			System.out.println("dequeue => " + queue.dequeue());
		}
		System.out.println(queue.size());

		queue.enqueue("I");
		queue.enqueue("J");
		// queue.enqueue("K");
		// queue.enqueue("L");
		// queue.enqueue("M");
		// queue.enqueue("N");
		// queue.enqueue("O");
		// queue.enqueue("P");

		for (int i = 0; i < 9; i++) {
			System.out.println("dequeue => " + queue.dequeue());
		}
		System.out.println(queue.size());

	}

}
