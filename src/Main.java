import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("isPalindrome--------------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){

        if(number<0) {int positive = number * -1;
            String strNumber = Integer.toString(positive);

            //char[] digits = strNumber.toCharArray();

            StringBuilder sb = new StringBuilder(strNumber);
            String strReversed = sb.reverse().toString();

            int numericNumber = Integer.valueOf(strReversed);

            if(positive==numericNumber) return true;

            else return false;}

        else {
            String strNumber = Integer.toString(number);

            //char[] digits = strNumber.toCharArray();

            StringBuilder sb = new StringBuilder(strNumber);
            String strReversed = sb.reverse().toString();

            int numericNumber = Integer.valueOf(strReversed);

            if (number == numericNumber) return true;

            else return false;
        }
    }
}