
import java.util.*;

public class Main {
    public static void subarray(int numbers[]){
      int ts = 0;
      int currsum =0;
      int maxsum = Integer.MIN_VALUE;

      for(int i=0; i<numbers.length; i++){
        int start = i;
        for(int j=i; j<numbers.length; j++){
          int end = j;
          currsum=0;
          for(int k=start; k<=end; k++){
            currsum += numbers[k];
          }System.out.println(currsum );
          if(maxsum<currsum){
            maxsum=currsum;
          }
          ts++;
          
        }
       
      }
      System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 9, 3};
        subarray(numbers);
    }
}
