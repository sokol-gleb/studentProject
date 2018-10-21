import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room: ");
        int appartmentNumber = scanner.nextInt();

        int n = appartmentNumber / 36 + (appartmentNumber % 36 == 0 ? 0 : 1);
        int cas = (appartmentNumber % 36) / 4 + ((appartmentNumber % 36) % 4 == 0 ? 1 : 0);
    }
}
