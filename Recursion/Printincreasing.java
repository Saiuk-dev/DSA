package Recursion;
import java.util.*;

public class Printincreasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number betewen 1 to 99");
        int n = sc.nextInt();
        increasing(n);
    }

    public static void increasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }
}
