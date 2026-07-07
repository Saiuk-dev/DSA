import java.util.*;
public class p1 {
    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14 ,15 ,16}};

       Printspiral(matrix);
    }

    public static void Printspiral(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startcol <= endcol && startrow <= endrow){

            //top
            for(int i = startcol; i<=endcol; i++){
                System.err.print(matrix[startrow][i]+" ");
            }

            //right
            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            //botoom
            for(int i=endcol-1; i>=startcol; i--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][i]+" ");
            }

            //left
            for(int i=endrow-1; i>=startrow; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        System.out.println();
    }
}
