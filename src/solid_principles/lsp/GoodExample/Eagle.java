package solid_principles.lsp.GoodExample;

public class Eagle implements FlyingBird {

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
