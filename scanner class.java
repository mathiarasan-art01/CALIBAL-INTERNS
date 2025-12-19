// to get a input from user by scanner class
import java.util.Scanner;
class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String name= scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();
        String address = scanner.nextLine();
        String department =scanner.nextLine();
        int score1=scanner.nextInt();
        double score=scanner.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("My score(int): " + score1 + "/100");
        System.out.println("My score (double): " + score/10);
        scanner.close();

    }
}