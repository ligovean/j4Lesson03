package queue;

public interface Queue<E> {
    boolean insert(E val);
    E remove();
    E peekFront();

    int size();
    boolean isEmpty();
    boolean isFull();
}
