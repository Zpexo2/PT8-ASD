package PT8_ASD;
public class ArrayQueue<E> implements Queue<E> {
    // instance variables
    private E[] data; 
    private int f = 0; 
    private int sz = 0; 

    // constructors
    public ArrayQueue() {
        this(10);
    } 

    public ArrayQueue(int capacity) { 
        data = (E[]) new Object[capacity];
    }

    // methods
    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return (sz == 0);
    }

    public void enqueue(E e) throws IllegalStateException {
        if (sz == data.length)
            throw new IllegalStateException("Queue is full");
        int avail = (f + sz) % data.length; 
        data[avail] = e;
        sz++;
    }

    public E first() {
        if (isEmpty())
            return null;
        return data[f];
    }
    public E dequeue() {
        if (isEmpty())
            return null;
        E answer = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }

}
