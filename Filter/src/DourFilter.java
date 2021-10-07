import java.util.ArrayList;
import java.util.Formattable;

public class DourFilter implements CarFilter{
    private int dour;

    public DourFilter(int dour) {
        this.dour = dour;
    }

    @Override
    public ArrayList<Car> filter(ArrayList<Car> cars) {
        ArrayList<Car> list = new ArrayList<>();
        for (Car car :cars){
            if (car.getDour() < dour){
                list.add(car);
            }
        }
        return list;
    }
}
