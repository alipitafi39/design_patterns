package solid_principles.isp.GoodExample;

public class InterfaceSegregationPrincipleMain {
	 public static void main(String[] args) {

	        Human human = new Human();

	        human.work();

	        human.eat();

	        Robot robot = new Robot();

	        robot.work();
	    }
}
