package Leetcode;
import java.util.*;

public class LC209 {
    public static void main(String[] args){
        int nums[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(nums, target));
    }
//main function
    public static int minSubArrayLen(int nums[] , int target){
        int left = 0;
        int sum = 0;
        int minlength = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(sum>=target){
                minlength = Math.min(minlength, i-left+1);
                sum -= nums[left];
                left++;
            }
        }
        if(minlength == Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
    }
}
