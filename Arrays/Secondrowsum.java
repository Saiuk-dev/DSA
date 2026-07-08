import java.util.*;
public class Secondrowsum{
     public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,2,5},{4,8,2}};
     int sum =0;

     //2nd row sum
     for(int j = 0; j<matrix.length; j++){
        sum += matrix[j][1];
     }

     System.out.println(sum);
     }
}