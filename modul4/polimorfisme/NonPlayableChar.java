package modul4.polimorfisme;

public class NonPlayableChar extends Character {

    public NonPlayableChar(Character ch) {
        this.name = ch.name;
    }

    @Override
    public void doWork() {
        System.out.println("NPC " + this.name + " is idle.");
    }
}
