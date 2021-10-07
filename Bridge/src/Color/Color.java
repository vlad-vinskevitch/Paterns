package Color;

import Shape.Shapes;

public abstract class Color {
    protected Shapes shapes;

    public Color(Shapes shapes) {
        this.shapes = shapes;
    }

    public abstract void drawColor();
}
