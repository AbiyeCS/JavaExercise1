import org.example.Car;
import org.example.Motorcycle;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2023, 25000, 4);
        Motorcycle bike = new Motorcycle("Honda", 2022, 8000, true);

        car.start();
        car.honk();
        System.out.println("Car insurance: $" + car.calculateInsurance());

        bike.start();
        bike.revEngine();
        System.out.println("Bike insurance: $" + bike.calculateInsurance());
    }
}
