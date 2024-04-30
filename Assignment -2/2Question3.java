. Mean of Array using Recursion

public class MeanOfArray {
    public static double mean(int[] arr, int n) {
        if (n == 0)
            return 0;
        else
            return (mean(arr, n - 1) * (n - 1) + arr[n - 1]) / n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        double result = mean(arr, n);
        System.out.println("Mean of the array: " + result);
    }
}
