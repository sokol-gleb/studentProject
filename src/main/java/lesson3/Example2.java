package lesson3;

public class Example2 {
    public static void main(String[] args) {
        int n = 10;
        int result = 0;
        for (int i = 0; i <= n; i += 2) {
            result += i;
        }
        System.out.println(result);
        int result1 = 0;
        for (int j = 0; j <= n; j++) {
            result1 += (j % 2 == 0) ? j : 0;
        }
        System.out.println(result1);
    }
}
