package circularQueue;

public class QueueEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QueueEmptyException() {
		super();
	}

	public QueueEmptyException(String message) {
		super(message);
	}

	public QueueEmptyException(String message, Throwable clause) {
		super(message, clause);
	}
}
