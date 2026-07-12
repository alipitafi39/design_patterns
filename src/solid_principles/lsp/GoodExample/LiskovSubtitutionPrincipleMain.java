package solid_principles.lsp.GoodExample;

public class LiskovSubtitutionPrincipleMain {

    public static void main(String[] args) {

        FlyingBird bird1 = new Sparrow();
        bird1.fly();

        FlyingBird bird2 = new Eagle();
        bird2.fly();

        Bird bird3 = new Penguin();
        bird3.eat();
    }
}
