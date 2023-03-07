package estruturaBasica;

public class Car {

    // Attributes
    String color;
    String model;
    int tankVolume;

    // Constructor
    public Car() {

    }

    public Car(String color, String model, int tankVolume) {
        this.color = color;
        this.model = model;
        this.tankVolume = tankVolume;
    }

    // Getters and Setters
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTankVolume() {
        return this.tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double priceFullTank(double gasPrice) {
        return this.tankVolume * gasPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", tankVolume=" + tankVolume +
                '}';
    }
}
