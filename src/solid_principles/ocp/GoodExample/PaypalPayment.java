package solid_principles.ocp.GoodExample;

public class PaypalPayment implements Payment {

    public void pay() {
        System.out.println("Paid by Paypal");
    }
}
