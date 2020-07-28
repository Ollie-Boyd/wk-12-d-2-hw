public class GiftCard implements IChargable {
    private String vendor;
    private double balance;

    public GiftCard(String vendor, double balance) {
        this.vendor = vendor;
        this.balance = balance;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    public void charge(double purchaseAmount) {
        balance -= purchaseAmount;
    }


}
