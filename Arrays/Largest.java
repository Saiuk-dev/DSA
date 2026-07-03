import java.util.*;
public class Largest {

    public static int getlargest(int numbers[]){
         int largest = Integer.MIN_VALUE;
         int smallest = Integer.MAX_VALUE;
         for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
         }
         System.out.println("Smallest element in the array is "+smallest);
        return largest;
    }
    

public static void main(String[] Args){
  int numbers[]={3,5,7,9,12,3,56,32,12,45,32,3,76};

  System.out.println("Largest element in the array is "+ getlargest(numbers));
}}