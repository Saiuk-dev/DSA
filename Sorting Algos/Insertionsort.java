import java.util.*;
public class Insertionsort {
    public static void main(String[] args){
        int arr[] = {5,6,6,8,9,7,5,4,2,3,0,1,2,3,5,6,9,8};
        Insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Insert(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr=arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
}
