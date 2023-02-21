package Lab2_3;
public class MyDoublyLinkedList<E> extends DoublyLinkedList<E>{
    public void Insert_sorted(Task t) { // Insert a task into the list in order of length
        Node<E> n = header.getNext();
        Node<E> prev = header;
        while(n.getElement() != null){ // Find the first task that is longer than the task to be inserted
            if(t.get_length() < ((Task) n.getElement()).get_length()) break;
            // If the task to be inserted is shorter than n, insert it between n and n.prev
            prev = n;
            n = n.getNext();
        }
        addBetween((E) t, prev, n); // If the task to be inserted is the longest, insert it at the end
    }

    public MyDoublyLinkedList(){
        super();
    }

    public void printTaskTimes(){
        Node<E> n = header.getNext();
        int count = 0;
        while(n.getElement() != null){
            Task t = (Task) n.getElement();
            count += t.get_length();
            System.out.println(t.get_name() + ": finished in " + t.get_length() + ". Total time: " + count);
            n = n.getNext();
        }
    }

}
