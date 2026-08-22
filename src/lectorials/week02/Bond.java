package lectorials.week02;

public class Bond {
    public static void main(String[] args) {
        BondCar myAston = new BondCar();
        myAston.startEngine();
        //myAston.accelerate(20.0, 10);
        myAston.fire(); // Launch a rocket
        myAston.sail(); // I love sea breeze…
        myAston.dive(); // Going underwater!

        Weapon myGun = new Pistol();
        myGun.fire(); // Shoot a bullet
        myGun = myAston;
        myGun.fire(); // Launch a rocket

    }
}
