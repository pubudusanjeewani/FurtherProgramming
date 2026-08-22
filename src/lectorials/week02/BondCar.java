package lectorials.week02;

public class BondCar extends Car implements Weapon, Boat, Submarine{
    public void fire(){
        System.out.println("Launch a rocket!");
    }

    public void sail(){
        System.out.println("I love sea breeze...");
    }

    public void dive(){
        System.out.println("Going underwater!");
    }
}
