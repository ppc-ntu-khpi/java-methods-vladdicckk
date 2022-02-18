package fateNumber;
public class Exercise{
public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }
}