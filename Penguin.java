package lsp;

public class Penguin implements Bird {
    @Override
    public void move() {
        System.out.println("Penguin is walking.");
    }
}