public class method {
    public static void main(String[] args) {
        greetUser("Alice");
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }       
}