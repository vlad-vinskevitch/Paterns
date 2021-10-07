import java.util.ArrayList;

public class SpeedFilter implements CarFilter{
    private int maxSpeed;

    public SpeedFilter(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public ArrayList<Car> filter(ArrayList<Car> cars) {
        ArrayList<Car> list = new ArrayList<>();
        for (Car car : cars){
            if (car.getMaxSpeed() < maxSpeed){
                list.add(car);
            }
        }
        return list;
    }
}
