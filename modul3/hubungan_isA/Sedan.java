package modul3.hubungan_isA;

public class Sedan extends Car {

    public int numDoors = 3;

    Sedan() {
        System.out.println("Sedan is created");
    }

    public void trunk() {
        System.out.println("Sedan is opening trunk");
    }

    // @Override
    public void honk() {
        super.honk();
        System.out.println("Sedan is honking");
    }

    public void getNumWheels() {
        System.out.println("Sedan has " + getNumWheel() + " wheels");
    }
}
