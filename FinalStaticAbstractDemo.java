// Abstract class
abstract class Vehicle {

    // static method
    static void vehicleType() {
        System.out.println("Vehicle type: Motor Vehicle");
    }

    // abstract method
    abstract void start();

    // final method
    final void stop() {
        System.out.println("Vehicle stopped (final method)");
    }
}

// Final class (cannot be inherited)
final class Car extends Vehicle {

    // Implementing abstract method
    @Override
    void start() {
        System.out.println("Car started using key");
    }

    // static method
    static void brand() {
        System.out.println("Brand: JavaCar");
    }
}

public class FinalStaticAbstractDemo {

    public static void main(String[] args) {

        // static method call (using class name)
        Vehicle.vehicleType();
        Car.brand();
        Vehicle v = new Car();

        // abstract method implementation call
        v.start();

        // final method call
        v.stop();

    }
}
