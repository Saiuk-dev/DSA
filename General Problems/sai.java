import java.util.*;

public class sai{

    public static void main(String[] args){
       Scanner Sc = new Scanner(System.in);
       System.out.println("Enter First Number: ");
       double num1 = Sc.nextDouble();
       System.out.println("Enter Second Number: ");
       double num2 = Sc.nextDouble();
       System.out.println("Enter Third Number: ");
       double num3 = Sc.nextDouble();
       double Average = (num1 + num2 + num3)/3;
       System.out.println("The Average of three numbers is: " + Average);
    }

    public static double Average(double num1, double num2, double num3){
        return (num1 + num2 + num3)/3;
    }
}