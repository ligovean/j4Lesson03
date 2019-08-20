package deque;

import queue.Queue;

public interface Deque<E> extends Queue<E> {
    boolean insertL(E val);
    E removeR();
    E peekFrontR();
}
