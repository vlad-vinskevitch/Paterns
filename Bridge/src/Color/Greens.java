package Color;

import Shape.Shapes;

public class Greens extends Color{
    public Greens(Shapes shapes) {
        super(shapes);
    }

    @Override
    public void drawColor() {
        System.out.println("draw green color");
        shapes.drawColor();
    }
}
