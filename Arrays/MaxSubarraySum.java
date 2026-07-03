import java.util.*;
public class MaxSubarraySum{
    public static void main(String[] args){
        int numbers[]= {2,4,6,8,10};
        Prefixsum(numbers);
    }

    public static void Prefixsum(int numbers[]){

        //Create Prefix Array
        int prefix[] = new int[numbers.length];
        prefix[0]= numbers[0];

        //form new Array
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }

        System.out.println("Prefix Array: "+Arrays.toString(prefix));

        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum;

                if(start == 0){ 
                    sum = prefix[end];
                } else {
                    sum = prefix[end] - prefix[start-1];
                }
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println("Maximum sum = "+max);
    }
}