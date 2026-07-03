public class SecondlargestinArray{
    public static void main(String Args[]){
        int nums[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,1,15,17,45,72,23,32,23,23};
System.out.println(SecondlargestinArray(nums));
    }

    public static int SecondlargestinArray(int nums[]){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]>max){
               secondmax = max;
                max = nums[i]; 
            } else if(nums[i]>secondmax && nums[i]!= max){
                secondmax = nums[i];
            }
        }
        return (secondmax == Integer.MIN_VALUE)?-1:secondmax;
        
    }
}