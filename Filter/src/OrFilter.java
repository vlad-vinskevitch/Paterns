import java.util.ArrayList;

public class OrFilter implements CarFilter{
    CarFilter carFilter1;
    CarFilter carFilter2;

    public OrFilter(CarFilter carFilter1, CarFilter carFilter2) {
        this.carFilter1 = carFilter1;
        this.carFilter2 = carFilter2;
    }

    @Override
    public ArrayList<Car> filter(ArrayList<Car> cars) {
        ArrayList<Car> list = carFilter1.filter(cars);
        ArrayList<Car> list2 = carFilter2.filter(cars);
        for (Car car : list2){
            if (!list.contains(car)){
                list.add(car);
            }
        }

        return list;
    }
}
