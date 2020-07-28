import java.util.ArrayList;

public abstract class PaymentCard implements IChargable {
    protected int cardNumber;
    protected String expiryDate;
    protected int securityNumber;
    protected ArrayList<Double> charges;


    public PaymentCard(int cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.charges = new ArrayList<Double>();
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }
}
