package modul3.hubungan_useA_hasA;

public class Driver {

    private Car coupe;

    public Driver() {
        this.coupe = new Car();
        System.out.println("Driver is created");
    }

    public void driving() {
        System.out.println("Driver is driving");
        System.out.println("Using a car that has " + coupe.numWheel + " wheels.");
    }
}
