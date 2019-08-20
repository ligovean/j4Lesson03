package stack;

public interface Stack<E> {
    boolean push (E val);
    E pop ();
    E peek ();

    int size();
    boolean isEmpty();
    boolean isFull();
}
