package queue;

public class QueueImpl<E> implements Queue<E>{
    protected static final int DEFAULT_HEAD = 0;
    protected static final int DEFAULT_TAIL = -1;
    protected final E[] data;
    protected int size;
    protected int head;
    protected int tale;

    @SuppressWarnings("unchecked")
    public QueueImpl(int maxCapacity) {
        this.data = (E[]) new Object[maxCapacity];
        this.head = DEFAULT_HEAD;
        this.tale = DEFAULT_TAIL;
    }

    public boolean insert(E val) {
        if (isFull()) return false;
        if (tale+1 == data.length)
            tale = DEFAULT_TAIL;
        data[++tale] = val;
        size++;
        return true;
    }

    public E remove() {
        if(isEmpty()) return null;
        if(head == data.length)
            head = DEFAULT_HEAD;
        E result = data[head++];
        size--;
        return result;
    }

    public E peekFront() {
        if(isEmpty()) return null;
        return data[head];
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

    public String getData(){
        String result="{";
        for (E value:data) {
            result +=(", " + value);
        }
        result +="}";
        return result;
    }

    public int getHead(){
        return head;
    }

    public int getTale(){
        return tale;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Empty queue";
        String result = "{";
        if (head<=tale) {
            for (int i = head; i <= tale; i++) {
                if (i == head) result += data[i];
                else result += "," + data[i];
            }
        }else {

            for (int i = head; i < data.length; i++) {
                if (i == head) result += data[i];
                else result += "," + data[i];
            }
            for (int i = 0; i <= tale; i++) {
                if (i==head) result += data[i];
                else result += "," + data[i];
            }

        }
        result +="}";
        return result;
    }
}
