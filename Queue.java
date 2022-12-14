package PT8_ASD;

public interface Queue<E> {

    /** Returns the number of element in the queue */
    int size();

    /** Tests whether the queue is empty */
    boolean isEmpty();

    /** Inserts an element at the rear of the queue */
    void enqueue(E e);

    /** Returns, but does not remove, the first element of the queue */
    E first();

    /** Removes and returns the first element of the queue */
    E dequeue();

}