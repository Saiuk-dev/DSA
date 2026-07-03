import java.util.*;
public class trappedwater1{
    public static void main(String[] args){
        int arr[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(arr));
    }

    public static int trap(int arr[]){
        
        //leftmax
        int leftmax[] = new int[arr.length];
        leftmax[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }

        //rightmax
        int rightmax[] = new int[arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            rightmax[i] = Math.max(arr[i], rightmax[i+1]);
        }

        int trappedwater = 0;
        for(int i=0; i<arr.length; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            trappedwater += waterlevel - arr[i];
        }
        return trappedwater;
    }
}