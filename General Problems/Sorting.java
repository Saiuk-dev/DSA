import java.util.*;

public class Sorting {
      public static void Bubblesort(int Array[]){
        for(int turn = 0; turn<Array.length; turn++){
            for(int j = 0; j<Array.length-1-turn; j++){
                if(Array[j]<Array[j+1]){
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
        
                }
            }
        }
    }

      public static void Selectionsort(int Array[]){
        for(int i = 0; i<Array.length; i++){
            int min = i;
            for(int j = i+1; j<Array.length; j++){
                if(Array[min] < Array[j]){
                    min = j;
                }
            }
            int temp = Array[min];
            Array[min] = Array[i];
            Array[i] = temp;

        }
    }

      
    public static void Insertionsort(int Array[]){
        for(int i =1; i<Array.length; i++){
            int curr = Array[i];
            int prev = i-1;
            //Finding postion for insertion
            while(prev >=0 && Array[prev]<curr){
                Array[prev+1] = Array[prev];
                prev--;
            }
            Array[prev+1]=curr;
        }
      }

      
      
      public static void print(int Array[]){
        for(int i = 0; i<Array.length; i++){
            System.out.print(Array[i]+" ");
        }
        System.out.println();
      }
    
      public static void main(String Args[]){
        int Array[] = {3,6,2,1,8,7,4,5,3};
        Insertionsort(Array);
        print(Array);

    }
}
