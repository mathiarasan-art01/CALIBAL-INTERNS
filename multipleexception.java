public class multipleexception {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; 
            int data = 100 / 0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }   
}
