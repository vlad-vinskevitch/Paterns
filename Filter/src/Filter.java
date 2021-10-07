import java.util.ArrayList;
import java.util.SortedMap;

public class Filter {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car(4,"green", 200);
        Car car2 = new Car(2,"red", 250);
        Car car3 = new Car(4, "blue", 180);
        cars.add(car1);
        cars.add(car3);
        cars.add(car2);

        OrFilter andFilter = new OrFilter(new DourFilter(2), new SpeedFilter(200));
        cars = andFilter.filter(cars);

        for (Car car: cars){
            System.out.println(car.getColor());
        }
//        cars = new DourFilter(4).filter(cars);
//        for (Car car : cars){
//            System.out.println(car.getDour()+"");
//        }
//        cars = new SpeedFilter(200).filter(cars);
//        for (Car car :cars){
//            System.out.println(car.getMaxSpeed()+"");
//        }
    }
}
