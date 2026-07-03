import java.util.*;
public class Practice {
    public static void main(String[] args){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3};
        selectionsort(arr);
    }

    public static void Bubblesort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]<arr[j]){
                    minpos = j;
                }
            }int temp = arr[minpos];
                arr[minpos] = arr[i];
                arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

