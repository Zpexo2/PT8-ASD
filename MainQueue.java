package PT8_ASD

public class MainQueue { // Kelas utama
    public static void main(String[] args) {

        Queue<Integer> Q = new ArrayQueue<>();
        Q.enqueue(5);
        Q.enqueue(3);
        System.out.println(Q.size());
        System.out.println(Q.dequeue());
        System.out.println(Q.isEmpty());
        System.out.println(Q.dequeue());
        System.out.println(Q.isEmpty());
        Q.enqueue(7);
        Q.enqueue(9);
        System.out.println(Q.first());
        Q.enqueue(4);
        System.out.println(Q.size());
        System.out.println(Q.dequeue());
        Q.enqueue(6);
        Q.enqueue(8);
        System.out.println(Q.dequeue());

    }

}