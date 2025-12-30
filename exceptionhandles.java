public class exceptionhandles {
    public static void main(String[] args) {
        try {
            int data = 100 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
