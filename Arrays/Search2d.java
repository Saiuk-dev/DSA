import java.util.*;
public class Search2d {
    public static void main(String[] args){
        int matrix[][] = {{10, 20, 30, 40},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
        int k = 35;
        System.out.println(search(matrix,k));
    }

    public static int search(int matrix[][], int k){
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j]==k){
                System.out.print("Key found at ("+i+","+j+")");
                return 1;
            }
        }
    }
    return 0;
}

}

