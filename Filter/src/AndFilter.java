import java.util.ArrayList;

public class AndFilter implements CarFilter{
    CarFilter carFilter1;
    CarFilter carFilter2;

    public AndFilter(CarFilter carFilter1, CarFilter carFilter2) {
        this.carFilter1 = carFilter1;
        this.carFilter2 = carFilter2;
    }

    @Override
    public ArrayList<Car> filter(ArrayList<Car> cars) {
        ArrayList<Car> list = carFilter1.filter(cars);
        return carFilter2.filter(list);
    }
}
