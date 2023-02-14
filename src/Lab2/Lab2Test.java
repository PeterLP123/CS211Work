package Lab2;
public class Lab2Test {
    public static void main(String[] args) {
        SinglyLinkedList<Task> taskList = new SinglyLinkedList<>();
        Task T1 = new Task("T1", 20);
        Task T2 = new Task("T2", 5);
        Task T3 = new Task("T3", 25);
        Task T4 = new Task("T4", 30);
        Task T5 = new Task("T5", 10);
        Task T6 = new Task("T6", 15);

        taskList.addLast(T1);
        taskList.addLast(T2);
        taskList.addLast(T3);
        taskList.addLast(T4);
        taskList.addLast(T5);
        taskList.addLast(T6);

        Print(taskList);

        SinglyLinkedList<Task> taskList2 = new SinglyLinkedList<>();
        if(taskList2.secondToLast() == null){
            System.out.println("secondToLast() returns null");
        };
    }

    public static void Print(SinglyLinkedList<Task> S){
        SinglyLinkedList.Node<Task> node = S.head;
        while(node != null){
            System.out.println(node.getElement().get_name() + "," + node.getElement().get_length());
            node = node.getNext();
        }
    }
}
