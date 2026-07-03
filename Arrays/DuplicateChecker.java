import java.util.Arrays;

public class DuplicateChecker {

    /* public static boolean containsDuplicate(int[] nums) {
        // Step 1: Outer loop for current element
        for (int i = 0; i < nums.length; i++) {
            // Step 2: Inner loop to compare with rest of the elements
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found
                }
            }
        }
        // Step 3: No duplicates found
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(nums1)); // true
        System.out.println(containsDuplicate(nums2)); // false
        System.out.println(containsDuplicate(nums3)); // true */

        public static void main(String[] args) {
            int[] nums = {1,2,3,4,5,6,7,8,9};
             Arrays.sort(nums);

            for(int i=0; i<nums.length-1; i++){
                if(nums[i]==nums[i+1]){
                    System.out.println("Dyplicates Exists ");
                    break;
                }else{
                    System.err.println("Duplicates do not exist ");
                    break;
                }
            }
            }
    }

