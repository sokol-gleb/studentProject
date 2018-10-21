import java.util.Scanner;

public class Task5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double a = multiEnter("Enter 1st side: ");
        double b = multiEnter("Enter 2ns side: ");
        double c = multiEnter("Enter 3rd side: ");

        if (triangleExist(a, b, c)) {
            System.out.println("This is a real triangle");
        } else {
            System.out.println("This is not a real triangle");
        }
    }

    private static boolean triangleExist(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static double multiEnter(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }
}
