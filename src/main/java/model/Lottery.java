package model;

import java.util.Random;

public class Lottery {

    final private ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(100));
    }
}
