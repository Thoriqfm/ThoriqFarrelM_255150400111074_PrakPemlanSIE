package modul5.bag_interface;

public class Crew implements ICrew, IKickabble, IAlive {

    private String name;
    private boolean alive;

    public Crew(String name) {
        this.name = name;
        this.alive = true; // default alive
    }

    @Override
    public void doWork() {
        System.out.println("Crew " + this.name + " is doing work.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void kick() {
        System.out.println(this.name + " (Crew) has been kicked out from the spaceship!");
    }

    public void callMeeting() {
        // validation if die
        if (!this.alive) {
            System.out.println(this.name + " is dead and cannot call a meeting.");
            return;
        }
        System.out.print(this.name + " found a corpse ");
        System.out.print("and calls a meeting. ");
        System.out.println("Let's find the impostor!");
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

/// ERROR : Crew class does not implement IImpostor interface, so it cannot have the kill method.
    // @Override
    // public void kill(ICrew crew) {

    // }

