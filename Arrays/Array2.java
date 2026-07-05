import java.util.*;
public class Array2{

      public static boolean Search(int matrix[][] , int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell ("+i+","+j+")");
                     return true;
                }
               
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key = 6;

        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        //input
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        Search(matrix , key);
    }

  
}
