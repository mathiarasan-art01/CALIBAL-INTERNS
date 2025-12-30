import java.util.Scanner;
public class recursion {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to factorial:");
        int n = scan.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }   
}
