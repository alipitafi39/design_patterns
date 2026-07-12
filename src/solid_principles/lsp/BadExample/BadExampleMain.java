package solid_principles.lsp.BadExample;

public class BadExampleMain {
	 public static void main(String[] args) {

	        Bird bird = new Sparrow();
	        bird.fly();

	        bird = new Penguin();
	        bird.fly();   // Runtime Exception
	    }
}
