public class Fibonacci {
    public static long fibonacciIterative(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0;
            long b = 1;
            long result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }

    private static long[] memo = new long[100]; // Массив для мемоизации
    public static long fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] != 0) {
            return memo[n];
        } else {
            long result = fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
            memo[n] = result;
            return result;
        }
    }

    public static long fibonacciDynamic(int n) {
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacciIterative(2));
        System.out.println(fibonacciRecursive(5));
        System.out.println(fibonacciDynamic(6));
    }
}