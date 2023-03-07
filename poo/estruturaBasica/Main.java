package estruturaBasica;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Red", "Uno", 50);
        Car car3 = new Car();

        car3.setColor("White");
        car3.setModel("Hilux");
        car3.setTankVolume(100);

        System.out.println("Total price: " + car1.priceFullTank(4.99));
        System.out.println("Total price: " + car3.priceFullTank(6.69));


    }
}
