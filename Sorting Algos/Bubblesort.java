import java.util.*;
public class Bubblesort {
    public static void main(String[] args){
         int[] arr={1,2,5,5,8,9,6,3,4,5,8,5,3,5,5,5,7,9,6,5};
         sort(arr);
         System.out.print(Arrays.toString(arr));
    }

    public static void sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
