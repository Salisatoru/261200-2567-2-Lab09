package lsp;

public class Sparrow implements FlyingBird {
    @Override
    public void move() {
        System.out.println("Sparrow is hopping.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}
