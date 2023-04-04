package Lab8;

public class Lab8Test {
    public static void main(String [] args){
        ProbeHashMap<Integer, Integer> map = new ProbeHashMap<>(5);
        map.put(1, 2);
        map.put(2, 4);
        map.put(3, 6);
        map.put(4, 8);
        map.put(5, 10);

        ProbeHashMap<Integer, Integer> map2 = new ProbeHashMap<>(10);
        map2.put(0, 0);
        map2.put(1, 2);
        map2.put(2, 4);
        map2.put(3, 6);
        map2.put(4, 8);
        map2.put(5, 10);
        map2.put(6, 12);
        map2.put(7, 14);
        map2.put(8, 16);
        map2.put(9, 18);

        ProbeHashMap<Integer, Integer> map3 = new ProbeHashMap<>(3);
        map3.put(10, 20);
        map3.put(30, 40);
        map3.put(50, 60);
        map3.put(70, 80);
        map3.put(90, 100);

        System.out.println("Map 1: " + map.getLoadFactor());
        System.out.println("Map 2: " + map2.getLoadFactor());
        System.out.println("Map 3: " + map3.getLoadFactor());

        map.remove(1);
        map.remove(2);
        map.remove(3);

        System.out.println("Map 1: " + map.getLoadFactor());
    }
}
