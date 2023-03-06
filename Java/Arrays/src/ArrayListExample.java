import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(5);
        list.add(10);
        list.add(12);
        list.add(23);
        list.add(9);
        list.add(5);
        list.add(11);
        list.add(25);
        list.add(65);
        System.out.println(list.contains(25));
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);


    }
}
