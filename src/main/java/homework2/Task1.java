package homework2;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task1 {
    private static final int RADIUS = 4;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double x = multiEntry("Enter the x coordinate: ");
        double y = multiEntry("Enter the y coordinate: ");

        if (isPointInArea(x, y)) {
            System.out.println("Inside the circle");
        } else {
            System.out.println("Not inside the circle");
        }

    }

    private static boolean isPointInArea(double x, double y) {
        return distance(x, y) < RADIUS;

    }

    private static double distance(double x, double y) {
        return sqrt((pow(y, 2) + pow(x, 2)));
    }

    private static double multiEntry(String message) {
        System.out.println(message);
        return SCANNER.nextDouble();
    }


}
