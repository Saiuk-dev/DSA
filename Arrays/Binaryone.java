import java.util.*;
public class Binaryone {
    public static void main(String[] args){
        int nums[] = {4,5,6,7,0,1,2};
        int key = 0;
        System.out.println(Binary(nums,key));
    }

    public static int Binary(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]== key){
                return mid; 
            }

            //left array is sorted from the mid
            if(arr[start]<=arr[mid]){
                //targest is in left half
                if(key>= arr[start]&& key<arr[mid]){
                    end = mid-1;
                } else{
                    start = mid +1;
                }
            }

            //Right array is sorted 
            else{
                //target lies in right half
                if(key>arr[mid] && key<=arr[mid]){
                    start=mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
