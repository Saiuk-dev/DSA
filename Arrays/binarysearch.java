import java.util.*;
public class binarysearch{
    public static void main(String[] args){
        int nums[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 16;
        System.out.println("index for the key is :"+ Binary(nums, key));
    }

    public static int Binary(int nums[], int key){
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==key){
                return mid;
            }
            if(nums[mid]<key){ //right
                start=mid+1;
            }
            else{ //left
                end=mid-1;
            }
        }
        return -1;
}
}