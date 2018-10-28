package lesson3;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        int result = factorial(n);

        System.out.println(result);

        System.out.println(recursFactorial(n));
//        int result1 = 1;
//        for (int j = 1; j <= n; j++) {
//
//            result1*=j;
//        }
//        System.out.println(result1);
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
    // 1*n*(n-1)*...*1

    //n!=n*(n-1)!=n*(n-1)*(n-2)!
    private static int recursFactorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * recursFactorial(n - 1);
    }
}
