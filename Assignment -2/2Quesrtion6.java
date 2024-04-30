Print reverse of a string using recursion

public class ReverseString {
    public static void reverseString(String str) {
        if (str.length() == 0)
            return;
        else {
            reverseString(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.print("Reverse of \"" + str + "\" is: ");
        reverseString(str);
    }
}
