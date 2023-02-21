package Lab2_3;
public class MySinglyLinkedList<E> extends SinglyLinkedList<E>{
    public void Insert_sorted(Task t){ // Insert a task into the list in order of length
        Node<E> n = head;
        Node<E> prev = null;
        while(n != null){ // Find the first task that is longer than the task to be inserted
            if(t.get_length() < ((Task) n.getElement()).get_length()) break;
            prev = n;
            n = n.getNext();
        }
        if(prev == null){ // If the task to be inserted is the shortest, insert it at the front
            addFirst((E) t);
        }else{ // Otherwise, insert it after the first task that is longer than it
            addAfter(prev, (E) t);
        }
    }

    public MySinglyLinkedList(){
        super();
    }

    public void printTaskTimes(){
        Node<E> n = head;
        int count = 0;
        while(n != null){
            Task t = (Task) n.getElement();
            count += t.get_length();
            System.out.println(t.get_name() + ": finished in " + count + ".");
            n = n.getNext();
        }
    }
}