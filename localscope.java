public class localscope {
    static int x = 10; // jimmy variable

    public static void main(String[] args) {
        int x = 5; // local variable
        System.out.println("Local x: " + x); //  local variable
        printjimmy();
    }

    public static void printjimmy() {
        System.out.println("jimmy x: " + localscope.x); // jimmy variable
    }
}
