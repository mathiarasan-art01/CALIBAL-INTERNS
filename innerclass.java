public class innerclass {
    private String outerField = "Outer Field";

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }

    public static void main(String[] args) {
        innerclass outer = new innerclass();
        innerclass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
