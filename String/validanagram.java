package String;
import java.util.*;

public class validanagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(Anagram(s, t));
    }

    public static boolean Anagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = s.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}
