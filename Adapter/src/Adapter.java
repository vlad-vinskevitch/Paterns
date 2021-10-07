public class Adapter {
    public static void main(String[] args) {
            CarWash carWash = new CarWash();
            carWash.washCar(new TrackWrap(new MyTrack()));
    }
}
