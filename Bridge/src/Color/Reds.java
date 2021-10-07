package Color;

import Shape.Shapes;

public class Reds extends Color{
    public Reds(Shapes shapes) {
        super(shapes);
    }

    @Override
    public void drawColor() {
        System.out.println("draw red color");
        shapes.drawColor();
    }
}
