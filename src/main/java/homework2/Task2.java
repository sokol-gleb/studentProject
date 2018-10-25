package homework2;

import java.util.Scanner;

public class Task2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double xa = initCoordinate("Enter x coordinate: ");
        double ya = initCoordinate("Enter y coordinate: ");

        double xb = initCoordinate("Enter x coordinate: ");
        double yb = initCoordinate("Enter y coordinate: ");

        double xc = initCoordinate("Enter x coordinate: ");
        double yc = initCoordinate("Enter y coordinate: ");

        double x = initCoordinate("Enter x coordinate: ");
        double y = initCoordinate("Enter y coordinate: ");

        double area = calculateArea(xa, ya, xb, yb, xc, yc);
        double area1 = calculateArea(xa, ya, x, y, xb, yb);
        double area2 = calculateArea(xa, ya, x, y, xc, yc);
        double area3 = calculateArea(xc, yc, x, y, xb, yb);

        double result = area - (area1 + area2 + area3);
        if (result == 0) {
            System.out.println("It's inside the triangle");
        } else {
            System.out.println("It's outside the triangle");
        }


    }

    private static double calculateArea(double xa, double ya, double xb, double yb, double xc, double yc) {
        double sideA = calculateSide(xa, ya, xb, yb);
        double sideB = calculateSide(xb, yb, xc, yc);
        double sideC = calculateSide(xa, ya, xc, yc);

        double p = (sideA + sideB + sideC) / 2;

        return calculateArea(sideA, sideB, sideC, p);
    }

    private static double calculateArea(double sideA, double sideB, double sideC, double p) {
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    private static double calculateSide(double xa, double ya, double xb, double yb) {
        return Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((ya - yb), 2));
    }


    private static double initCoordinate(String s) {
        System.out.println(s);
        return SCANNER.nextDouble();
    }
}
