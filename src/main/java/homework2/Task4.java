package homework2;

import java.util.Scanner;

public class Task4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int num = enterNum();
        String line = String.valueOf(num);

        boolean end = false;
        end = checking(end, line);
        if (end) {
            System.out.println();
        }
    }

    private static int enterNum() {
        System.out.println("Enter 8 digit number: ");
        return SCANNER.nextInt();
    }

    private static boolean checking(boolean end, String check) {
        for (int i = 0; i < check.length(); i++) {
            for (int j = check.length(); j > 0; j--) {
                if (check.charAt(i) == check.charAt(j)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return end;
    }
}

// 1234 4321
// 1