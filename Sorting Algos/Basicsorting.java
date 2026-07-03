import java.util.*;
import java.util.Arrays;
import java.util.Collection;
public class Basicsorting {
    public static void Bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

        //Insertsort
    public static void insertsort(int arr[]){
        for(int i = 1; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding posotion for insertion
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
                //insertion
                arr[prev+1] = curr;
        }
    }
    
    public static void print(int arr[]){
           for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
           }
           System.out.println();
    }
    

    //selectionsort
    public static void Selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] >  arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        

       
    } 
    
    //countsort
    public static void countsort(int arr[]) {
    int largest = Integer.MIN_VALUE;

    // Step 1: Find the largest value
    for (int i = 0; i < arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }

    // Step 2: Create and fill count array
    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }

    // Step 3: Sort original array using count array
    int j = 0;
    for (int i = 0; i < count.length; i++) {
        while (count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
}

    public static void main(String[] args) {
        int arr[]={5,3,5,6,9,2,4};
        //insertsort(arr);
        //Arrays.sort(arr);
        //Arrays.sort(arr,Collections.reverseOrder());
        countsort(arr);
        print(arr);
    }
}
