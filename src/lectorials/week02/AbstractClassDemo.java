package lectorials.week02;

import java.util.ArrayList;

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Q6
        //Below is not allowed.
        //Vehicle vehicle = new Vehicle();

        Vehicle v1 = new Car();
        System.out.println(v1.startEngine());

        Vehicle v2 = new Motorcycle();
        System.out.println(v2.startEngine());

        //Create an ArrayList that can store Vehicle objects (including any subclasses of Vehicle).
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());

        for(Vehicle vehicle: vehicles) {
            System.out.println(vehicle.startEngine());
        }
    }
}
