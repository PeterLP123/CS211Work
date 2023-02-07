package Lab1;
public class PoIQueue<E> implements Queue<E>{
    public int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;
    public PoIQueue() {}
    private static class Node<E> {
        private final E element;
        private Node<E> next;
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(E e) {
        Node<E> newest = new Node<>(e, null);
        if(isEmpty()) head = newest;
        else tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E first() {
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E dequeue() {
        if(isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0) tail = null;
        return answer;
    }

    public PoIQueue<E> concatenate(PoIQueue<E> q) {
        PoIQueue<E> newQueue = new PoIQueue<>();
        while(!this.isEmpty()){
            newQueue.enqueue(this.dequeue());
        }
        while(!q.isEmpty()){
            newQueue.enqueue(q.dequeue());
        }
        return newQueue;
    }
}