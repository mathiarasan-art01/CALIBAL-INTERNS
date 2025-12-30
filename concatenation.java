public class concatenation {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "I'm MATHI";
        
        // Use + operator 
        String result1 = str1 + str2;
        System.out.println("BY + operator: " + result1);
        
        // Use concat() method 
        String result2 = str1.concat(str2);
        System.out.println("BY concat() method: " + result2);
    }
}
