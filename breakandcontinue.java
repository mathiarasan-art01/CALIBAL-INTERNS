public class breakandcontinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i == 25) {
                System.out.println("Skipping number: " + i);
                continue; // Skip the rest of the loop when i is 5
            }
            if (i == 35) {
                System.out.println("Breaking the loop at number: " + i);
                break; // Exit the loop when i is 8
            }
            System.out.println("Current number: " + i);
        }
    }
}
