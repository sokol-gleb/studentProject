package homework2;

import java.util.Scanner;

public class Task4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int num = enterNum();

        if (check(num)) {
            System.out.println("Palindrome ");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }

    private static boolean check(int num) {
        int[] arr = new int[8];
        arr[0] = num / 10_000_000;
        arr[1] = num / 1_000_000 - (arr[0] * 10);
        arr[2] = num / 100_000 - (arr[0] * 100 + arr[1] * 10);
        arr[3] = num / 10_000 - (arr[0] * 1_000 + arr[1] * 100 + arr[2] * 10);
        arr[4] = num / 1_000 - (arr[0] * 10_000 + arr[1] * 1_000 + arr[2] * 100 + arr[3] * 10);
        arr[5] = num / 100 - (arr[0] * 100_000 + arr[1] * 10_000 + arr[2] * 1_000 + arr[3] * 100 + arr[4] * 10);
        arr[6] = num / 10 - (arr[0] * 1_000_000 + arr[1] * 100_000 + arr[2] * 10_000 + arr[3] * 1_000 + arr[4] * 100 + arr[5] * 10);
        arr[7] = num % 10;

        return checkDigits(arr);
    }

    private static boolean checkDigits(int[] arr) {
        boolean isSame = true;
        for (int i = 0; i < 4; i++) {
            if (arr[i] != arr[7 - i]) {
                isSame = false;
            }
        }
        return isSame;
    }

    private static int enterNum() {
        System.out.println("Enter 8 digit number: ");
        return SCANNER.nextInt();
    }


}