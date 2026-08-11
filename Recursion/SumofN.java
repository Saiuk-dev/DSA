package Recursion;
import java.util.*;

public class SumofN {
    public static void main(String[] args){
        int n = 10;
        System.out.println("The sum of Numbers is: "+ Sum(n));
    }

    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = Sum(n-1);
        int sn = n+ snm1;
        return sn;
    }
}
