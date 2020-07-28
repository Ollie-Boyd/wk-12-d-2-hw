import java.util.ArrayList;

public class OnlineAccount {
    private String name;
    private ArrayList<IChargable> paymentMethods;
    private ReportingSoftware reportingSoftware;

    public OnlineAccount(String name, ArrayList<IChargable> paymentMethods, ReportingSoftware reportingSoftware) {
        this.name = name;
        this.paymentMethods = paymentMethods;
        this.reportingSoftware = reportingSoftware;
    }

    public String getName() {
        return name;
    }

    public ArrayList<IChargable> getPaymentMethods() {
        return paymentMethods;
    }

    public ReportingSoftware getReportingSoftware() {
        return reportingSoftware;
    }
}
