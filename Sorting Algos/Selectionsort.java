import java.util.*;
public class Selectionsort {
    public static void main(String[] args){
        int arr[] = {3,5,2,3,6,4,7,8,9,0,2,3,5,3,2,3,5,6,9};
        Selctionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Selctionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Bubble(int arr[]){
        for(int i=0;i<arr.length-1; i++){
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
