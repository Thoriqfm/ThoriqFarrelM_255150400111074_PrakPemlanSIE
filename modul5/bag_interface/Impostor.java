package modul5.bag_interface;

public class Impostor implements IImpostor, ICrew, IKickabble, IAlive {

    private String name;
    private boolean alive;

    public Impostor(String name) {
        this.name = name;
        this.alive = true; // default alive
    }

    @Override
    public void kill(ICrew crew) {
        System.out.println(crew.getName() + " has been killed!");
        // new logic
        if (crew instanceof IAlive aliveCrew) {
            aliveCrew.setAlive(false);
        }
    }

    @Override
    public void doWork() {
        System.out.println("Impostor " + this.name + " is doing work.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void kick() {
        System.out.println(this.name + " (Impostor) has been kicked out from the spaceship!");
    }

    @Override
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public boolean isAlive() {
        return this.alive;
    }
}
