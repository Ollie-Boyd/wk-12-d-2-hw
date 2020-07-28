public interface IChargable {
    public double getTransactionCost(double purchaseAmount);
    public void charge(double purchaseAmount);
}
