public class CreditCard extends PaymentCard{
    private double customerRiskMultiplyer;
    private double creditLimit;
    private double transactionFee;

    public CreditCard(int cardNumber, String expiryDate, int securityNumber, double customerRiskMultiplyer, double creditLimit) {
        super(cardNumber, expiryDate, securityNumber);
        this.customerRiskMultiplyer = customerRiskMultiplyer;
        this.creditLimit = creditLimit;
        this.transactionFee = 0.02;
    }

    public double getCustomerRiskMultiplyer() {
        return customerRiskMultiplyer;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


    public double getTransactionCost(double purchaseAmount) {
        return transactionFee * purchaseAmount;
    }

    public void charge(double purchaseAmount) {
        creditLimit -= purchaseAmount;
    }
}
