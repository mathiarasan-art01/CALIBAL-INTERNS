public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(4, " Language");
        sb.replace(0, 4, "Core");
        sb.delete(4, 13);
        System.out.println(sb.toString());

        StringBuffer obj = new StringBuffer("Thread");
        obj.append(" Safe");
        obj.reverse();
        System.out.println(obj  .toString());
    }
}

