import java.util.*;

public class Spiralarray {

    public static void printspiral(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while(startrow <= endrow && startcol <= endcol){
            // Top
            for(int j = startcol; j <= endcol; j++){
                System.out.print(matrix[startrow][j] + " ");
            }

            // Right
            for(int i = startrow + 1; i <= endrow; i++){
                System.out.print(matrix[i][endcol] + " ");
            }

            // Bottom
            if(startrow < endrow){
                for(int j = endcol - 1; j >= startcol; j--){
                    System.out.print(matrix[endrow][j] + " ");
                }
            }

            // Left
            if(startcol < endcol){
                for(int i = endrow - 1; i > startrow; i--){
                    System.out.print(matrix[i][startcol] + " ");
                }
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        int n = matrix.length;
        int m = matrix[0].length;

        // Input
        System.out.println("Enter 4x4 matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("Matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Spiral Output
        System.out.println("Spiral Order:");
        printspiral(matrix);
    }
}
