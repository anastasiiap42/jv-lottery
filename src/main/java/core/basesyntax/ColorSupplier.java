package core.basesyntax;

import model.Color;
import java.util.Random;

public class ColorSupplier {

    public Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
