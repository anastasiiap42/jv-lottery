package model;

import core.basesyntax.ColorSupplier;

public class Lottery {

    private static final int MAX_NUMBER = 100;
    final ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), colorSupplier.getRandom().nextInt(MAX_NUMBER + 1));
    }
}
