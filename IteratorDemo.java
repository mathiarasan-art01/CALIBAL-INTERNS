import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String value = itr.next();
            System.out.println(value);
        }
    }
}
