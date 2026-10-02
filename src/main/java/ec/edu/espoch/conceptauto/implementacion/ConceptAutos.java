
package ec.edu.espoch.conceptauto.implementacion;

import ec.edu.espoch.conceptauto.objetos.ConceptAuto;

/**
 *
 * @author Jonat
 */
public class ConceptAutos {
    
    public void accelerate(int speedIncrement,ConceptAuto auto) {
        if (speedIncrement < 0) {
            return;
        }
        double aux = auto.getCurrentSpeed() + speedIncrement ;
        auto.setCurrentSpeed(aux);
    }

    public void decelerate(double speedDecrement, ConceptAuto auto) {
        if (speedDecrement < 0) {
            return;
        }
        double aux = auto.getCurrentSpeed()- speedDecrement;
        auto.setCurrentSpeed(aux);
    }

    public int brake(ConceptAuto auto) {
        return 0;
    }

    public double calculateEstimatedArrivalTime(double distanceToTravel, ConceptAuto auto) {
        if (auto.getCurrentSpeed() <= 0) {
            return Double.POSITIVE_INFINITY;
        }
        return distanceToTravel / auto.getCurrentSpeed();
    }
     public void displayAttributes(ConceptAuto auto) {
        System.out.println("===== ConceptAuto =====");
        System.out.println("Brand          : " + auto.getBrand());
        System.out.println("Model          : " + auto.getModel());
        System.out.println("Engine         : " + auto.getEngine());
        System.out.println("Fuel type      : " + auto.fuelType);
        System.out.println("Car type       : " + auto.carType);
        System.out.println("Number of doors: " + auto.getNumberOfDoors());
        System.out.println("Number of seats: " + auto.getNumberOfSeats());
        System.out.println("Max speed      : " + auto.getMaxSpeed());
        System.out.println("Color          : " + auto.color);
        System.out.println("Current speed  : " + auto.getCurrentSpeed());
        System.out.println("=======================");
    }

}
