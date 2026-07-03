import java.util.*;
public class SellBuyStocks{

    public static void main(String[] args){
        int price[] = {7,1,5,3,6,4};
        System.out.println(Profit(price));
    }

    public static int Profit(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<arr.length; i++){
            if (arr[i] > buyprice) {
    int profit = arr[i] - buyprice;
    maxprofit = Math.max(maxprofit, profit);
} else {
    buyprice = arr[i];
}
        }
        return maxprofit;
    }
}