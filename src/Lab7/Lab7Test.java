package Lab7;

public class Lab7Test {
    public static void main(String [] args){
        HeapPriorityQueue<Integer, Integer> heapPriorityQueue = new HeapPriorityQueue<Integer, Integer>();
        heapPriorityQueue.insert(10, 10);
        heapPriorityQueue.insert(6, 6);
        heapPriorityQueue.insert(2, 2);
        heapPriorityQueue.insert(8, 8);
        heapPriorityQueue.insert(5, 5);
        heapPriorityQueue.insert(12, 12);
        heapPriorityQueue.insert(20, 20);
        heapPriorityQueue.insert(18, 18);
        heapPriorityQueue.insert(19, 19);
        for (int i = 0; i <= 20; i++) {
            System.out.println(heapPriorityQueue.Contains(i) + ": " + i);
        }
        System.out.println("Maximum: " + heapPriorityQueue.getMax());
    }
}
