package solid_principles.lsp.GoodExample;

public class Sparrow implements FlyingBird {

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
