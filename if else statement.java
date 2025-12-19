
import java.util.Scanner;

// if else statement practice
class q5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1>num2)
        {
            System.out.print("Number 1 is greater");
        }
        else{
            System.out.print("Number 2 is greater");
        }
        scanner.close();

    }
    
}
