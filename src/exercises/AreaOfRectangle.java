package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double height;
        double width;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the Rectangle: ");
        height = scanner.nextDouble();
        System.out.println("Enter the width of the Rectangle: ");
        width = scanner.nextDouble();

        area = height * width;

        System.out.println("The area of this Rectangle is: " + area);
    }
}
