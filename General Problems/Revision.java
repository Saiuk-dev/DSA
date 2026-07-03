import java.util.*;
public class Revision{

      public static void Print(){
        System.out.println("Hi Sai ");
      }

      public static int Sum(int a, int b){
         int sum = a+b;
         System.out.println(sum);
         return sum;
      }
    public static void main(String[] args) {
        Print();
        //fact(7);
        //System.out.println(bin(5,2));
        System.out.println(prime(5));
    }

    public static void Swap(){
        int x = 4;
        int y = 7;

        //swap
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Value Of X is:"+x);
        System.out.println("Value of y is: "+y);


    }
    public static int prod(int a, int b){
        int mul = a*b;
        System.out.println("The multiplication of given program value is: "+mul);
        return mul;
    }

    public static int fact(int n){
      int f = 1;
      for(int i =1;i<=n;i++){
        f = f*i;
      }
      System.err.println("FActorial Of givn Number is : "+f);
      return f;
    }

    public static int bin(int n, int r ){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);

        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;
    }

    public static boolean prime(int n){
        boolean isprime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){//completely dividing 
isprime = false;
break;
            }
        }
        return isprime;
    }
}