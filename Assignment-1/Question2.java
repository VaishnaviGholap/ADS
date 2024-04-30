//2. Write a java program to LCM of TWO given number. 

public class LCMCalculator {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 15;

        int lcm = calculateLCM(number1, number2);
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);
    }

    public static int calculateLCM(int number1, int number2) {
        int max = Math.max(number1, number2);
        int lcm = max;

        while (true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                return lcm;
            }
            lcm += max;
        }
    }
}
