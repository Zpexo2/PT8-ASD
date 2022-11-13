package PT8_ASD;

public class LinkedListQueue<E> implements Queue<E> {

    private LinkedList<E> list = new LinkedList<>();

    public LinkedListQueue() {
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(E element) {
        list.addLast(element);
    }

    public E first() {
        return list.first();
    }

    public E dequeue() {
        return list.removeFirst();
    }

}