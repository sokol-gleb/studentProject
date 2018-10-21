import java.util.Scanner;

public class Task4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int year = getYear();

        leapOrNot(year);
    }

    private static int getYear() {
        System.out.println("Enter year: ");
        return scanner.nextInt();
    }

    private static void leapOrNot(int year) {
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
