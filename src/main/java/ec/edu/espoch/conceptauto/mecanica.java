package ec.edu.espoch.conceptauto;

import ec.edu.espoch.conceptauto.objetos.ConceptAuto;
import ec.edu.espoch.conceptauto.enumeration.FuelType;
import ec.edu.espoch.conceptauto.enumeration.Color;
import ec.edu.espoch.conceptauto.enumeration.CarType;

/**
 *
 * @author Jonat
 */
public class mecanica {

    public static void main(String[] args) {

        ConceptAuto auto = new ConceptAuto("Toyota", 2019, 80, FuelType.GASOLINE, CarType.FAMILY_CAR, 5, 7, 100, Color.RED);

        auto.setBrand("Toyota");
        auto.setCurrentSpeed(24);
        auto.setEngine(30);
        auto.setMaxSpeed(500);
        auto.setModel(2020);
        auto.setNumberOfDoors(5);
        auto.setNumberOfSeats(10);
        
        auto.displayAttributes();

        auto.accelerate(80);System.out.println("Tras acelerar 80: " + auto.getCurrentSpeed());

        auto.accelerate(500);System.out.println("Tras acelerar 500 (límite maxSpeed): " + auto.getCurrentSpeed());

        auto.decelerate(120);System.out.println("Tras decelerar 120: " + auto.getCurrentSpeed());

        System.out.println("Tiempo estimado para 240 km: "+ auto.calculateEstimatedArrivalTime(240.0) + " h");

        double velocidadPrevia = auto.brake();System.out.println("Frenó desde " + velocidadPrevia + " -> velocidad actual: " + auto.getCurrentSpeed());

        System.out.println("Tiempo estimado detenido: " + auto.calculateEstimatedArrivalTime(240.0));auto.displayAttributes();
    }
}
