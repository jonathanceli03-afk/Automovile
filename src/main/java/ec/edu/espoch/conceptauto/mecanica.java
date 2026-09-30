package ec.edu.espoch.conceptauto;

/**
 *
 * @author Jonat
 */
public class mecanica {

    public static void main(String[] args) {

        ConceptAuto auto = new ConceptAuto(
                "Toyota", 2024, 2.0,
                FuelType.GASOLINE, CarType.SUV,
                5, 7, 200.0, Color.RED);

        auto.displayAttributes();

        auto.accelerate(80);
        System.out.println("Tras acelerar 80: " + auto.currentSpeed);

        auto.accelerate(500);
        System.out.println("Tras acelerar 500 (límite maxSpeed): " + auto.currentSpeed);

        auto.decelerate(120);
        System.out.println("Tras decelerar 120: " + auto.currentSpeed);

        System.out.println("Tiempo estimado para 240 km: "
                + auto.calculateEstimatedArrivalTime(240.0) + " h");

        double velocidadPrevia = auto.brake();
        System.out.println("Frenó desde " + velocidadPrevia + " -> velocidad actual: " + auto.currentSpeed);

        System.out.println("Tiempo estimado detenido: " + auto.calculateEstimatedArrivalTime(240.0));

        auto.displayAttributes();
    }
}


class ConceptAuto {

    public String brand;
    public int model;
    public double engine;
    public FuelType fuelType;
    public CarType carType;
    public int numberOfDoors;
    public int numberOfSeats;
    public double maxSpeed;
    public Color color;
    public double currentSpeed = 0;

    public ConceptAuto(String brand, int model, double engine, FuelType fuelType,
                       CarType carType, int numberOfDoors, int numberOfSeats,
                       double maxSpeed, Color color) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void accelerate(int speedIncrement) {
        if (speedIncrement < 0) {
            return;
        }
        currentSpeed = Math.min(currentSpeed + speedIncrement, maxSpeed);
    }

    public void decelerate(int speedDecrement) {
        if (speedDecrement < 0) {
            return;
        }
        currentSpeed = Math.max(currentSpeed - speedDecrement, 0);
    }

    public double brake() {
        double previousSpeed = currentSpeed;
        currentSpeed = 0;
        return previousSpeed;
    }

    public double calculateEstimatedArrivalTime(double distanceToTravel) {
        if (currentSpeed <= 0) {
            return Double.POSITIVE_INFINITY;
        }
        return distanceToTravel / currentSpeed;
    }

    public void displayAttributes() {
        System.out.println("===== ConceptAuto =====");
        System.out.println("Brand          : " + brand);
        System.out.println("Model          : " + model);
        System.out.println("Engine         : " + engine);
        System.out.println("Fuel type      : " + fuelType);
        System.out.println("Car type       : " + carType);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Max speed      : " + maxSpeed);
        System.out.println("Color          : " + color);
        System.out.println("Current speed  : " + currentSpeed);
        System.out.println("=======================");
    }
}