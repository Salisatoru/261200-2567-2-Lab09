package lsp;

public class Eagle implements FlyingBird {
    @Override
    public void move() {
        System.out.println("Eagle is walking.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying.");
    }
}
