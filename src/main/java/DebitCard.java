public class DebitCard extends PaymentCard{
    protected int sortCode;
    protected int accountNumber;
    protected double transactionCost;

    public DebitCard(int cardNumber, String expiryDate, int securityNumber, int sortCode, int accountNumber, double transactionCost) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.transactionCost = 1.01;
    }

    public int getSortCode() {
        return sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public double getTransactionCost(double purchaseAmount) {
        return purchaseAmount * transactionCost;
    }

    public void charge(double purchaseAmount) {
        this.charges.add(purchaseAmount);
    }
}
