import java.util.*;
public class Checkduplicate{
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5,6};
        System.out.println(duplicate(arr1));
    }

    public static boolean duplicate(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                } 
        }
    }
    return false;
}
}