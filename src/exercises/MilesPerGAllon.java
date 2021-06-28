package exercises;

import java.util.Scanner;

public class MilesPerGAllon {
    public static void main(String[] args){
        double milesDriven;
        double gasConsumed;
        double milesPerGallon;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How far did you travel (in miles): ");
        milesDriven = scanner.nextDouble();
        System.out.println("How many gallons of gas was used: ");
        gasConsumed = scanner.nextDouble();

        milesPerGallon = milesDriven / gasConsumed;

        System.out.println("Your gas gets " + milesPerGallon + "mph.");
    }
}
