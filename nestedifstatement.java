import java.util.Scanner;
public class nestedifstatement {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter a number:");
        long number =scan.nextLong();

        if (number > 0) {
            System.out.println("The number is positive.");
            System.out.println(" Number's Kind:");

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
