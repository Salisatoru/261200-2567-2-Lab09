package lsp;

public class LspMain {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        FlyingBird sparrow = new Sparrow();

        penguin.move();
        sparrow.move();
        sparrow.fly();
    }
}
