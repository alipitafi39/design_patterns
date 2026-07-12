package solid_principles.isp.GoodExample;

public class Human implements Workable, Eatable {

    public void work() {
        System.out.println("Working");
    }

    public void eat() {
        System.out.println("Eating");
    }
}
