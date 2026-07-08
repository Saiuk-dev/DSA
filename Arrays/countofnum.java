import java.util.*;
public class countofnum {
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,2,5},{4,8,2}};
        int key = 2;
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
              if(matrix[i][j]==key){
                count+=1;
              }
            }
        }
        System.out.println(count);
    }
}
