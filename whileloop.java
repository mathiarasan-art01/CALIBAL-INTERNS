import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a starting number:");
       int count = scanner.nextInt();
        while (count <= 100) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
