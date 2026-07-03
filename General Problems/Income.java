import java.util.*;
public class Income{

    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Income ");
        int n = sc.nextInt();
        int tax;
        
        if(n<500000){
            tax = 0;
       }else if(n>=500000 && n<1000000){
        tax =(int) (n * 0.2);
       }else{
        tax =(int)(n * 0.4);
       }
       System.out.println("Your Income Tax is: "+tax);
    }
}