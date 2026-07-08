import java.util.*;
public class Secondrowsum{
     public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,2,5},{4,8,2}};
     int sum =0;

     //2nd row sum
     for(int j = 0; j<matrix[0].length; j++){
        sum += matrix[1][j];
     }

     System.out.println(sum);
     }
}