
package ec.edu.espoch.conceptauto;

/**
 *
 * @author Jonat
 */
public class ConceptAuto {

    private String brand;
    private int model;
    private double engine;
    public FuelType fuelType;
    public CarType carType;
    private int numberOfDoors;
    private int numberOfSeats;
    private double maxSpeed;
    public Color color;
    private double currentSpeed = 0;
   
/*----------------------------------------------------*/

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
/*-------------------------------------------------------------*/    
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

    public ConceptAuto(String brand, int model, double engine, FuelType fuelType, CarType carType, int numberOfDoors, int numberOfSeats, double maxSpeed, Color color) {
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
}