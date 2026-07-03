import java.util.*;
public class Stocks1{
    public static void main(String[] args){
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println(Stocks(price));
    }

    public static int Stocks(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for(int i=0; i<arr.length; i++){
            if(buyprice<arr[i]){
               // int profit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit, arr[i] - buyprice);
            }else{
                buyprice = arr[i];
            }
        }
        return maxprofit;
    }
}