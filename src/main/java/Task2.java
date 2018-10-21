import java.util.Scanner;

public class Task2 {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int a = initNumber("Enter 1st num: ");
        int b = initNumber("Enter 2nd num: ");
        int c = initNumber("Enter 3rd num: ");
        int d = initNumber("Enter 4th num: ");

        int max = getMax(a, b, c, d);
        System.out.println(max);
    }

    private static int getMax(int a, int b, int c, int d) {

        int max1 = max(a, b); //Math.max
        int max2 = max(c, d);
        return max(max1,max2);

    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static int initNumber(String message) {
        System.out.println(message);
        return SCANNER.nextInt();
    }
}
