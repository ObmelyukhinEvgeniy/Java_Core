package lesson1;

public class Barriers extends Obstacle {
    protected int length;
    protected double height;

    public Barriers(int length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void doIt(Going going) {
        going.swimming(length);
        going.jumping(height);
    }
}
