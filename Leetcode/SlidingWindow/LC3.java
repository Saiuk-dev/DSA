package Leetcode.SlidingWindow;
import java.util.*;

public class LC3 {
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(String s));
    }

    public static int lengthOfLongestSubstring(String s){
        int left = 0;
        int maxlength = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){ //if true
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxlength = Math.max(maxlength, i-left+1);
        }
        return maxlength;
    }
}
