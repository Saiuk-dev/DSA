import java.util.*;
public class practice{
    public static void main(String[] args){
        int numbers[]= {2,4,6,8,10};
        int num[]={-2,-3,4,-1,-2,1,5,-3};
         kadanes(num);
    }

    public static void Pairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                System.out.println("("+numbers[i]+","+numbers[j]+")");
            }
        }
    }

    public static void Subarray(int numbers[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                sum = 0;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum += numbers[k];
                }
                System.out.println();
                System.out.println("Sum is: "+sum);
            }
            System.out.println();
            if(sum>max){
            max = sum;
        }
        }
        
        System.out.println("Maximum sum is: "+ max);
    }

    public static void Prefixsum(int numbers[]){
        int prefix[] = new int[numbers.length];
        prefix[0]=numbers[0];

        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }
        
        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int sum;
                int end = j;
                if(start==0){
                    sum = prefix[end];
                }else{
                    sum = prefix[end] - prefix[start-1];
                }
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println("Max sum is: "+max);
    }

    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
        System.out.println(cs);
    }
}