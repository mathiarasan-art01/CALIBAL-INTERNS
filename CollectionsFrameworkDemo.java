import java.util.*;
 
public class CollectionsFrameworkDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Duplicate");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}

