public class Main {
  static int john(int x, int y) {
    return x + y;
  }
  
  static double john(double x, double y) {
    return x + y;
  }
  
  public static void main(String[] args) {
    int myNum1 = john(8, 5);
    double myNum2 = john(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}
