package Lab2_3;
public class MyDoublyLinkedList<E> extends DoublyLinkedList<E>{
    public void Insert_sorted(Task t) {

    }

    public MyDoublyLinkedList(){
        super();
    }

    public void printTaskTimes(){
        Node<E> n = header;
        int count = 0;
        while(n != null){
            Task t = (Task) n.getElement();
            count += t.get_length();
            System.out.println(t.get_name() + ": finished in " + count + ".");
            n = n.getNext();
        }
    }

}
