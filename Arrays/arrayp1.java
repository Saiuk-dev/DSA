import java.util.*;
public class arrayp1{
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        int prefsum = 0;

        int prod = 1;
        for(int i = 0; i<arr.length; i++){
            prod = prod * arr[i];
        }
         System.out.println(prod);

         for(int i = 0; i < arr.length; i++) {
    System.out.print(prod / arr[i] + " ");
}
System.out.println();
        for(int i = 0; i<arr.length; i++){
            arr[i]= prefsum + arr[i];
            prefsum = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}