package modul4.polimorfisme;

public class AmongUsGame {

    public static void main(String[] args) {

        // Create references of Character

        // deklarasi tipe superclass
        Character brian, cindy, david, jacky;

        // Crew --> Character
        brian = new Crew("Brian");
        cindy = new Crew("Cindy");
        david = new Crew("David");
        jacky = new Crew("Jacky");

        brian.doWork();
        cindy.doWork();
        david.doWork();
        jacky.doWork();

        // downcasting
        jacky = (Character) new Impostor(jacky);

        jacky.kill(cindy);

        if (david instanceof Crew crew) {
            crew.callMeeting();
        }

        // Perubahan jacky di "topeng" dengan NPC
        jacky = (Character) new NonPlayableChar(jacky);

        AmongUsGame.check(brian);
        AmongUsGame.check(david);
        AmongUsGame.check(jacky);
    }

    // 2. di dalam check(), isImpostor() dipanggil
    public static void check(Character ch) {
        if (AmongUsGame.isImpostor(ch)) {
            System.out.println(ch.name + " is an impostor!");
        } else {
            System.out.println(ch.name + " is not the impostor.");
        }
    }

    // 3. isImpostor() mengembalikkan true karena jacky instanceof impostor --> true
    public static boolean isImpostor(Character ch) {
        return (ch instanceof Impostor); // jacky adalah objek impostor --> TRUE
    }
}
