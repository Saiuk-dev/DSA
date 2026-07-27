package String;

import java.util.*;
public class Str {
    public static void main(String[] args) {
       String name = "Tony Stark";
       System.out.println(Substring(name, 0, 7));
    }

    public static String Substring(String name , int si , int ei){
        String substr="";
        for(int i=si ; i<ei; i++){
            substr += name.charAt(i);
        }
        return substr;
    }
}
