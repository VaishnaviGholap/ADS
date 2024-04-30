//1. Write a Java Program to find GCD of two given numbers. 

public class GCDCalculator {

  public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;

        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

}
