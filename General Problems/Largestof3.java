import java.util.*;
public class Largestof3{

    public static void main(String[] args){
        int a = 3;
        int b = 61;
        int c = 9;

        if((a>=b) && (a>=c)){
            System.out.println("Largest number is a");
        }else if((b>=c)){
            System.out.println("b is Largest Number ");
        }else{
            System.out.println("C is LArgest Number ");
        }
    }
}
