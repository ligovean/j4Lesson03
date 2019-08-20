package deque;

import queue.QueueImpl;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E>{


    public DequeImpl(int maxCapacity) {
        super(maxCapacity);
    }

    public boolean insertL(E val) {
      if (isFull()) return false;
      if (head == 0)
          head = data.length;
      data[--head] = val;
      size++;
      return true;
    }

    public E removeR() {
        if(isEmpty()) return null;
        if (tale == 0)
            tale=data.length-1;
        E result = data[tale--];
        size--;
        return result;
    }

    public E peekFrontR() {
        if(isEmpty()) return null;
        return data[tale];
    }
}
