public class Methods {
 
  void movement(String action) {
    System.out.println("Car is  Moving :" + action);
  }

  void speedcar(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String[] args) {
    Methods myCar = new Methods();    
    myCar.movement("Forward");      
    myCar.speedcar(200);          
}
}