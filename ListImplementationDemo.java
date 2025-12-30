import java.util.*;

public class ListImplementationDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            al.add(i * 10);
        }

        LinkedList<Integer> ll = new LinkedList<>();
        ll.addAll(al);
        ll.addFirst(5);
        ll.addLast(100);

        System.out.println(al);
        System.out.println(ll);
    }
}

