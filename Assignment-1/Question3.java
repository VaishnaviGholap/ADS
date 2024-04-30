
//Write a Java Program to print all the Prime Factorsof the Given Number. 
public class PrimeFactors {
    
    public static void primeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        if (n > 2) {
            System.out.print(n);
        }
    }
    
    public static void main(String[] args) {
        int number = 12;
        System.out.print("Prime factors of " + number + " are: ");
        primeFactors(number);
    }
}
public class PrimeFactors {
    
    public static void primeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        if (n > 2) {
            System.out.print(n);
        }
    }
    
    public static void main(String[] args) {
        int number = 12;
        System.out.print("Prime factors of " + number + " are: ");
        primeFactors(number);
    }
}
