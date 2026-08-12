package Leetcode;
import java.util.*;

public class LC643 {
    public static void main(String[] args){
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("The maximum average of sub aaray is: "+ findMaxAverage(nums, k));
    }

    //Function to find maximum Average of THe sub Array
    public static double findMaxAverage(int nums[] , int k){
        int left = 0;
        int sum = 0;
        int maxsum = 0;

        //first window
        for(int i=0; i<k; i++){
            sum += nums[i];
            maxsum = sum;
        }

        //now start leaving the elemsts aside 
        for(int i=k; i<nums.length; i++){
            sum -= nums[left];
            left++;
            sum += nums[i];
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return (double) maxsum/k;
    }
}
