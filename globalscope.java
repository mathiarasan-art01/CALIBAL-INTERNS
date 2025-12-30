public class globalscope {
    static int x = 20; // global variable

    public static void main(String[] args) {
        System.out.println("Global x: " + x); // global variable
        changeX();
        System.out.println("Modified global x: " + x); // change in global variable
    }

    public static void changeX() {
        x += 10; // change in global variable
    }   
}
