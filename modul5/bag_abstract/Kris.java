package modul5.bag_abstract;

public class Kris extends Emoney {

    public Kris() {
        this.name = "Kris";
    }

    // Todo: Bonus 5% diberikan ketika melakukan deposit dan diskon belanja 3% diberikan ketika pembayaran.
    @Override
    public void topUp(double amount) {
        System.out.println("Top up " + amount);
        this.balance += (amount + (0.05 * amount));
        this.balance();
    }

    @Override
    public void pay(double amount) {
        // Diskon 3% langsung
        double amountToPay = amount - (0.03 * amount);
        if (this.balance > amountToPay) {
            this.balance -= amountToPay;
            System.out.printf("Pay " + amount);
            System.out.println(" using " + this.name);
        } else {
            System.out.println("Not enough balance.");
        }
        this.balance();
    }

}
