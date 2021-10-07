public class Car {
    private int dour;
    private String color;
    private int maxSpeed;

    public int getDour() {
        return dour;
    }

    public void setDour(int dour) {
        this.dour = dour;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(int dour, String color, int maxSpeed) {
        this.dour = dour;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
