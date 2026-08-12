package Leetcode.SlidingWindow;
import java.util.*;

public class LC1456 {
    public static void main(String[] args){
        String s = "abcdeeeifaeioah";
        int k = 4;
        System.out.println(VowelCount(s, k));
    }

    public static int VowelCount(String s, int k){
        int left = 0;
        int count = 0;
        int maxcount = 0;

        //First Window
        for(int i=0; i<k; i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
            maxcount = count;
        }

        //Second Window
        for(int i=k ; i<s.length() ; i++){
               if(isvowel(s.charAt(left))){
                count--;
               } 
               left++;
               if(isvowel(s.charAt(i))){
                count++;
               }
               maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }

    //Helper Function
    public static boolean isvowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
