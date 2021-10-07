
import Color.Color;
import Color.Greens;
import Color.Reds;
import Shape.Rectangle;
import Shape.Triangle;

public class Bridge {
    public static void main(String[] args) {
        Color[] colors = {
            new Greens(new Triangle()),
                new Reds(new Rectangle())
        };
        for (Color color :colors){
            color.drawColor();
        }
    }
}
