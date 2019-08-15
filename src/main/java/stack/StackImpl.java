package stack;

public class StackImpl<E> implements Stack<E> {
    private final E[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public StackImpl(int maxCapacity) {
        this.data = (E[]) new Object[maxCapacity];
    }

    public boolean push(E val) {
        if (isFull()) return false;
        data[size++] = val;
        return true;
    }

    public E pop() {
        if (isEmpty()) return null;
        return data[size--];
    }

    public E peek() {
        if (isEmpty()) return null;
        return data[size-1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
            return size == data.length;
    }
}
