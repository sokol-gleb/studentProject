package lesson3;

public class Sum {
    public static void main(String[] args) {
        int n = 3;
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        System.out.println(result);

        System.out.println(sum(n));
    }

    private static int sum(int n) {
        return (n == 0) ? 0 : n + sum(n - 1);
    }
}
