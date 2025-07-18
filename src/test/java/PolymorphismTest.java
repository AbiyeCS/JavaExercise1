import org.example.Car;
import org.example.Motorcycle;
import org.example.Vehicle;

public class PolymorphismTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("BMW", 2023, 40000, 2),
                new Motorcycle("Yamaha", 2022, 12000, false),
                new Car("Honda", 2024, 30000, 4)
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println("Now Starting: " + vehicle.getBrand());
            vehicle.start();
            System.out.println("Your insurance: " + vehicle.calculateInsurance());

            System.out.println("Now Going to do some maintenance for Car");
            serviceVehicle(vehicle);
        }
    }

    public static void serviceVehicle(Vehicle vehicle) {
        // Should work with any vehicle type
        System.out.println("Servicing " + vehicle.getBrand());
        vehicle.stop();
        vehicle.start();
    }
}
