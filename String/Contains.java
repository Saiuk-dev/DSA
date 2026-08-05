package String;
import java.util.*;

public class Contains {
 public static void main(String[] args){
    String s = "abcde";
    String goal = "cdeab";
    System.out.println(Rotation(s, goal));
 }

 public static boolean Rotation(String s, String goal){
    if(s.length() != goal.length()){
        return false;
    }

    return (s+s).contains(goal);
 }
}
