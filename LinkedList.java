package PT8_ASD;

public class LinkedList<T> {
    
        private static class Node<T> {
    
            private T element;
            private Node<T> next;
    
            public Node(T element, Node<T> next) {
                this.element = element;
                this.next = next;
            }
    
            public T getElement() {
                return element;
            }
    
            public Node<T> getNext() {
                return next;
            }
    
            public void setNext(Node<T> next) {
                this.next = next;
            }
        }
    
        private Node<T> head = null;
        private Node<T> tail = null;
        private int size = 0;
    
        public LinkedList() {
        }
    
        public int size() {
            return size;
        }
    
        public boolean isEmpty() {
            return size == 0;
        }
    
        public T first() {
            if (isEmpty()) {
                return null;
            }
            return head.getElement();
        }
    
        public T last() {
            if (isEmpty()) {
                return null;
            }
            return tail.getElement();
        }
    
        public void addFirst(T element) {
            head = new Node<>(element, head);
            if (size == 0) {
                tail = head;
            }
            size++;
        }
    
        public void addLast(T element) {
            Node<T> newest = new Node<>(element, null);
            if (isEmpty()) {
                head = newest;
            } else {
                tail.setNext(newest);
            }
            tail = newest;
            size++;
        }
    
        public T removeFirst() {
            if (isEmpty()) {
                return null;
            }
            T answer = head.getElement();
            head = head.getNext();
            size--;
            if (size == 0) {
                tail = null;
            }
            return answer;
        }
    
        public void print() {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.getElement() + " ");
                current = current.getNext();
            }
            System.out.println();
        }
    

}