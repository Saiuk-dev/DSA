import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;

        while (palindrome!=0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (num == reverse){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("Number: "+ num + " is a palindrome");
        }
        else{
            System.out.println("Number: "+ num + " is a not a  palindrome");
        }
        
    }

}