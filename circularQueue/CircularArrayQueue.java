package circularQueue;

public class CircularArrayQueue implements Queue {

	private static int capacity;
	private Object[] obj;
	private int N; //
	private int f;
	private int r;

	public CircularArrayQueue() {
		this(5); // default capacity
	}

	public CircularArrayQueue(int capacity) {
		this.capacity = capacity;
		f = 0;
		r = 0;
		N = 0;
		obj = new Object[capacity];
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public boolean isEmpty() {
		return N == 0;
	}

	@Override
	public boolean isFull() {
		return size() == capacity;
	}

	@Override
	public void enqueue(Object o) throws QueueFullException {
		if (isFull()) {
			throw new QueueFullException("Queue is Full");
		} else {
			obj[r] = o;
			r = (r + 1) % capacity;
			N++;
		}
	}

	@Override
	public Object dequeue() throws QueueEmptyException {
		if (isEmpty()) {
			throw new QueueEmptyException("Queue is Empty");
		} else {
			Object o = obj[f];
			obj[f] = null;
			f = (f + 1) % capacity;
			N--;
			return o;
		}
	}
}
