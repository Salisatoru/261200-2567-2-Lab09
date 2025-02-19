public class LspMain {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        FlyingBird sparrow = new Sparrow();
        Bird ostrich = new Ostrich(); // Add Ostrich
        FlyingBird eagle = new Eagle(); // Add Eagle

        penguin.move();
        sparrow.move();
        sparrow.fly();
        
        ostrich.move();
        eagle.move();
        eagle.fly(); // Eagle can also fly
    }
}
