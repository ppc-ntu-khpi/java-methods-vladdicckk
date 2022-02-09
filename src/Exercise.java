package fateNumber;

public class Exercise{
    public static void main(String [] args){
        Exercise pn = new Exercise();

        if(pn.isPalindrome("ABBA")){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }   
    }

    

    public boolean isPalindrome(String original){
        int i = original.length()-1;
        int j=0;
        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}