import java.util.Scanner;
public class shorthandifelse {
    public static void main(String[] args) {
        Scanner scan=new java.util.Scanner(System.in);
        System.out.println("Enter your age:");
        int age= scan.nextInt();
        String forvote = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(forvote);
    }
}
