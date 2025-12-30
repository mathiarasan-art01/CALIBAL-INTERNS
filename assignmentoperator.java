public class assignmentoperator {
    public static void main(String[] args) {
        int x = 63467;
        int y = 673467;
        
        x += y; 
        System.out.println("Value of x after += : " + x);
        
        x -= 5; 
        System.out.println("Value of x after -= : " + x);
        
        x *= 2; 
        System.out.println("Value of x after *= : " + x);
        
        x /= 3; 
        System.out.println("Value of x after /= : " + x);
        
        x %= 4; 
        System.out.println("Value of x after %= : " + x);
    }
}
