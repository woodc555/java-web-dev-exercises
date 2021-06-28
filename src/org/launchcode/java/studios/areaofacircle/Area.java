package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Radius: ");
        radius = scanner.nextDouble();

        System.out.println(Circle.getArea(radius));
    }
}
