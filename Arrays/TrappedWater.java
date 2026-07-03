import java.util.*;

public class TrappedWater{

    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.print(Trappedwater(height));
    }

    public static int Trappedwater(int arr[]){
        int n = arr.length;
        //Leftmax
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }

        //Rightmax
        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(arr[i], rightmax[i+1]);
        }

        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++){
            //Waterlevel = min(Leftmax, Rightmax)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            //trapped water = waterlevel - height[i]
            trappedwater += waterlevel - arr[i];
        }
        return trappedwater;
    }
}