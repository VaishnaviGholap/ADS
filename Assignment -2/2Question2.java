2. Sum of natural numbers using recursion

public class SumOfNaturalNumbers {
    public static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + result);
    }
}