package homework2;

import java.util.Scanner;

public class Task3 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int LENGTH = 4;

    public static void main(String[] args) {

        int num = initNum();

        if (checkLength(num)) {
            printInfo(num);
        } else {
            System.out.println("Number is not correct length");
        }
    }

    private static void printInfo(int num) {
        if (isNumSpecial(num)) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not special Number");
        }
    }

    private static boolean checkLength(int num) {
        return String.valueOf(num).length() == LENGTH;
    }

    private static boolean isNumSpecial(int num) {
        int arr0 = num / 1000;
        int arr1 = num / 100 - (arr0 * 10);
        int arr2 = num / 10 - (arr0 * 100 + arr1 * 10);
        int arr3 = num % 10;

        int checkLeft = arr0 + arr1;
        int checkRight = arr2 + arr3;

        return checkLeft == checkRight;

    }


    private static int initNum() {
        System.out.println("Enter four digit number: ");
        return SCANNER.nextInt();
    }
}
