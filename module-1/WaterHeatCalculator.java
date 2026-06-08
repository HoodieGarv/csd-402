/*
 *
 * [Garvin Stewart]
 * [June 7th, 2026]
 * Assignment 1 - CSD-402
 *
 * WaterHeatCalculator.java
 *
 * Calculates the energy in Joules needed to heat water
 * from an initial temperature to a final temperature.
 *
 * Formula:
 *   Q = waterMass * (finalTemperature - initialTemperature) * 4184
 *
 *   Q                  = Energy in Joules
 *   waterMass          = Mass of water in kilograms
 *   initialTemperature = Starting temperature in Celsius
 *   finalTemperature   = Target temperature in Celsius
 *   4184               = Specific heat capacity of water (J/kg * C)
 *
 */
import java.util.*;

public class WaterHeatCalculator{

  public static void main(String [] args){

    double waterMass;
    double initialTemperature;
    double finalTemperature;
    double Q;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the amount of water in kilograms: ");
    waterMass = input.nextDouble();

    System.out.println("\nEnter the initial temperature in Celsius: ");
    initialTemperature = input.nextDouble();

    System.out.println("\nEnter the final temperature in Celsius: ");
    finalTemperature = input.nextDouble();

    Q = waterMass * (finalTemperature - initialTemperature) * 4184;

    System.out.println("\nThe energy needed to heat the water is " + Q + " Joules");
  }
}
