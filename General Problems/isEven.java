import java.util.*;
public class isEven {
    public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = Sc.nextInt();
    if(isEven(num)){
        System.out.println("Number is Even");
    } else {
        System.out.println("Number is Odd");
    }
    }
    public static boolean isEven(int num0){
        if(num0 % 2 == 0){
            return true;
        } else {
            return false;
        }
    }}
