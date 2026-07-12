package solid_principles.ocp.BadExample;

public class PaymentService {
	
	public void pay(String type) {

        if(type.equals("CARD")) {
            System.out.println("Card Payment");
        }
        else if(type.equals("UPI")) {
            System.out.println("UPI Payment");
        }
    }

}
