import java.util.*;

public class array123{
    public static void main(String[] args){
       int num[] = {2,4,6,8,10,13,15,17,19,23,25,28,29};
       int largest = Largest(num);
       System.out.println("The largest elemet in the array is: "+largest);
       int Smallest = Smallest(num);
       System.out.println("The Smallest Value in the Array is: "+Smallest);

    }

    public static int Largest(int num[]){
        int smallest = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            if(smallest<num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static int Smallest(int num[]){
         int largest = Integer.MAX_VALUE;
         for(int i=0; i<num.length; i++){
            if(largest>num[i]){
                largest = num[i];
            }
         }
         return largest;
    }
}

