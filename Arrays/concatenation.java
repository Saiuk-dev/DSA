import java.util.Arrays;

public class concatenation{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,3};

        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i = 0; i<nums.length; i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        System.out.println("New Concatenated array is :" + Arrays.toString(ans));
    } 
}   
