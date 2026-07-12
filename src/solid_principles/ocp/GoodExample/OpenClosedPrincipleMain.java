package solid_principles.ocp.GoodExample;

public class OpenClosedPrincipleMain {
	   public static void main(String[] args) {

	        Payment payment = new PaypalPayment();

	        payment.pay();
	    }
}
