package Recursion;
import java.util.*;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1-15");
        int n = sc.nextInt();

        System.out.println(fact(n)+" Is the factorial of " + n);
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnmi = fact(n-1);
        int fn = n * fnmi;
        return fn;
    }
}
