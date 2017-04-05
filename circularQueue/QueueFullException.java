package circularQueue;

public class QueueFullException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QueueFullException() {
		super();
	}

	public QueueFullException(String message) {
		super(message);
	}

	public QueueFullException(String message, Throwable clause) {
		super(message, clause);
	}
}
