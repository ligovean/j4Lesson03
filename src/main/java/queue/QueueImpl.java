package queue;

public class QueueImpl<E> implements Queue<E>{
    private static final int DEFAULT_HEAD = 0;
    private static final int DEFAULT_TAIL = -1;
    private final E[] data;
    private int size;
    private int head;
    private int tale;

    @SuppressWarnings("unchecked")
    public QueueImpl(int maxCapacity) {
        this.data = (E[]) new Object[maxCapacity];
        this.head = DEFAULT_HEAD;
        this.tale = DEFAULT_TAIL;
    }

    public boolean insert(E val) {
        if (isFull()) return false;
        if (tale+1 == data.length){
            tale = DEFAULT_TAIL;
        }
        data[++tale] = val;
        size++;
        return true;
    }

    public E remove() {
        E result = data[head++];
        size--;
        return result;
    }

    public E peekFront() {
        return null;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }
}
