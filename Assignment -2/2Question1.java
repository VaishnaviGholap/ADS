//1. Print 1 to n without using loops

public class PrintNumbers {
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}