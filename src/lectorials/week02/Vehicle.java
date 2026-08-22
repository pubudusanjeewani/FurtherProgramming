package lectorials.week02;

public abstract class Vehicle {
    private double price;
    private String name;

    /*
    public Vehicle() {
        this.price = 1;
        this.name = "";
    }
    */

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract String startEngine();

    public String toString(){
        return "This is a vehicle";
    }

    public void sayHello(){
        System.out.println("Hello " + this.name);
    }
}
