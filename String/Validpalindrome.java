package String;
import java.util.*;

public class Validpalindrome {
    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        System.out.println(ispalindrome(str));
    }

    public static boolean ispalindrome(String str){
        
        StringBuilder str1 = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                str1.append(Character.toLowerCase(ch));
            }
        }
        int n = str1.length();

        for(int i=0; i<str1.length()/2; i++){
            if(str1.charAt(i) != str1.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
