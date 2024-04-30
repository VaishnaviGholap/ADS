Print Fibonacci Series in reverse order using Recursion

public class ReverseFibonacci {
    public static void reverseFibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fib[i] + " ");
        }
    }

    public static void main(String[] args) {
        int count = 5;
        System.out.print("Reverse Fibonacci Series: ");
        reverseFibonacci(count);
    }
}