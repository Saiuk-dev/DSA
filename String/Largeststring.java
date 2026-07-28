package String;
import java.util.*;

public class Largeststring {
    public static void main(String[] args){
    String fruits[] = {"apple", "bannana", "mango", "kiwi"};
    String largest = fruits[0];
    for(int i=1; i<fruits.length; i++){
        if(largest.compareTo(fruits[i])<0){
            largest = fruits[i];
        }
    }
    System.out.println(largest);
}
}
