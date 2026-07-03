import java.util.*;
public class training{
    public static void main(String[] args){
    /*  int num = 2345;
        int lastDigit = num % 10;
        int firstDigit = num / 1000;

        int sum = firstDigit + lastDigit;
        
        System.out.println("Sum of first and last digit = " + sum); */


        //swap
       /*  int a = 5;
        int b = 7;
        a = a + b;
        b = a + b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b); */
      
    /*  Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your marks : ");
        int marks = Sc.nextInt();

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 80){
            System.out.println("Grade B");
        }
        else if(marks >= 70){
            System.out.println("Grade C");
        }
        else if(marks >= 60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade Fail");
        } */

        
         /*int num = 1234;
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits = " + sum); */

       
       /* int num = 1234;
        int product = 1;
        while(num != 0){
            product *= num % 10;
            num /= 10;
        }
        System.out.println("Product of digits = " + product);   */

        
        /*  int num1 = 1234;
        int largest = 0;
        while(num1 != 0){
            int digit = num1 % 10;
            if(digit > largest){
                largest = digit;
            }
            num1 /= 10;
        }
        System.out.println("Largest digit = " + largest);*/



    
    /*public static int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }*/
    
   /*  public static boolean isArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        System.out.println("Sum of cubes of digits = " + sum);
        return sum == originalNum; */


       /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number ");
        int num = sc.nextInt();
        boolean isprime = true;

        if(num <=1){
            isprime= false;
        }else{
            for(int i = 2; i<num; i++){
                if(num%2==0){
                    isprime = false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number ");
        } */
/* 
            int n = 9; */

       /*  for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= n; col++) {

                if(row == 1 || row == n ||
                   col == 1 || col == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        } */
      
      /*  int n = 5;

        // Upper Pyramid
        for(int row = 1; row <= n; row++) {

            for(int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
                
        }

        // Lower Reverse Pyramid
        for(int row = n - 1; row >= 1; row--) {

            for(int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        } */
       int num2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.err.println(Checkifsorted(num2));

        
    
    }
     public static Boolean Checkifsorted(int num2[]){
       for(int i = 0; i<num2.length-1; i++){
          if(num2[i]>num2[i+1]){
                return false;
          }
          }
       return true;
     }

     public class movezerolast{
        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5,3,0,1,8}
            System.out.println(Arrays);

            
        }
     }
}
