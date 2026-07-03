import java.util.*;

public class triplets{
    public static void main(String[] args){
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int nums[]){
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}