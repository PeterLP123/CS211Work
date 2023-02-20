package Lab2_3;
public class MyDoublyLinkedList<E> extends DoublyLinkedList<E>{
    public void Insert_sorted(Task t) {
        Node<E> n = header;
        Node<E> prev = null;
        prev = n;
        n = n.getNext();
        if(n.getElement() == null){
            addFirst((E) t);
            return;
        }
        while(n.getElement() != null){
            if(t.get_length() < ((Task) n.getElement()).get_length()){
                addBetween((E) t, prev, n);
                return;
            }
            prev = n;
            n = n.getNext();
        }
        addBetween((E) t, prev, n);
    }

    public MyDoublyLinkedList(){
        super();
    }

    public void printTaskTimes(){
        Node<E> n = header;
        n = n.getNext();
        int count = 0;
        while(n.getElement() != null){
            Task t = (Task) n.getElement();
            count += t.get_length();
            System.out.println(t.get_name() + ": finished in " + t.get_length() + ". Total time: " + count);
            n = n.getNext();
        }
    }

}
