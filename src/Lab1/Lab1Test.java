package Lab1;

public class Lab1Test {
    public static void main(String [] args){
        PoIQueue<PoI> queue = new PoIQueue<>();
        queue.enqueue(new PoI("Greece", "Athens"));
        queue.enqueue(new PoI("France", "Paris"));
        queue.enqueue(new PoI("Italy", "Rome"));
        queue.enqueue(new PoI("Spain", "Madrid"));

        System.out.println("Queue size: " + queue.size());
        System.out.println("First element: " + queue.first().get_country() + ", " + queue.first().get_city());

        PoIQueue<PoI> queue2 = new PoIQueue<>();
        queue2.enqueue(new PoI("Ireland", "Dublin"));
        queue2.enqueue(new PoI("Germany", "Berlin"));
        queue2.enqueue(new PoI("Portugal", "Lisbon"));
        queue2.enqueue(new PoI("Poland", "Warsaw"));

        PoIQueue<PoI> queue3 = queue.concatenate(queue2);
        System.out.println("Queue size: " + queue3.size());
        System.out.println("First element: " + queue3.first().get_country() + ", " + queue3.first().get_city());
        System.out.println("Dequeue: " + queue3.dequeue().get_country() + ", " + queue3.dequeue().get_country());
        System.out.println("Dequeue: " + queue3.dequeue().get_country() + ", " + queue3.dequeue().get_country());
        System.out.println("Dequeue: " + queue3.dequeue().get_country() + ", " + queue3.dequeue().get_country());
        System.out.println("Queue size: " + queue3.size());
        System.out.println("First element: " + queue3.first().get_country() + ", " + queue3.first().get_city());
    }
}