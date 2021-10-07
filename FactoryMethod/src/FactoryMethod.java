public class FactoryMethod {
    public static void main(String[] args) {
       TransportFactory transportFactory = createFactoryForTag("plane");
       Transport transport = transportFactory.createTransport();
       transport.createTransport();
    }
    static TransportFactory createFactoryForTag(String tag){
        if (tag.equalsIgnoreCase("car")){
            return new CarFactory();
        }else if (tag.equalsIgnoreCase("ship")){
            return new ShipFactory();
        }else if (tag.equalsIgnoreCase("plane")){
            return new PlaneFactory();
        }
        else{
            throw new RuntimeException(tag + " unknown");
        }
    }
}
