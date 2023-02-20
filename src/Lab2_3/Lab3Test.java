package Lab2_3;
public class Lab3Test {
    public static void main(String [] args){
        MySinglyLinkedList<Task> taskList = new MySinglyLinkedList<>();
        Task T1 = new Task("T1", 20);
        Task T2 = new Task("T2", 5);
        Task T3 = new Task("T3", 25);
        Task T4 = new Task("T4", 30);
        Task T5 = new Task("T5", 10);
        Task T6 = new Task("T6", 15);
        taskList.Insert_sorted(T1);
        taskList.Insert_sorted(T2);
        taskList.Insert_sorted(T3);
        taskList.Insert_sorted(T4);
        taskList.Insert_sorted(T5);
        taskList.Insert_sorted(T6);
        taskList.printTaskTimes();

        MyDoublyLinkedList<Task> taskList2 = new MyDoublyLinkedList<>();
        Task T7 = new Task("T7", 20);
        Task T8 = new Task("T8", 5);
        Task T9 = new Task("T9", 25);
        Task T10 = new Task("T10", 30);
        Task T11 = new Task("T11", 10);
        Task T12 = new Task("T12", 15);
        taskList2.Insert_sorted(T7);
        taskList2.Insert_sorted(T8);
        taskList2.Insert_sorted(T9);
        taskList2.Insert_sorted(T10);
        taskList2.Insert_sorted(T11);
        taskList2.Insert_sorted(T12);
        taskList2.printTaskTimes();
    }
}
