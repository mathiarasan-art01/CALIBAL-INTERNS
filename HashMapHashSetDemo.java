import java.util.*;

public class HashMapHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Apple");

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Mathi");
        hm.put(102, "Arasan");
        hm.put(101, "Updated");

        System.out.println(hs);
        System.out.println(hm);
    }
}
