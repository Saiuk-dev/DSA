public class Numberedtriangle{
    public static void main(String[] args) {
        int n = 5 ;
        for(int row = 1; row <=n; row++){
            for(int col = 1; col<=n-row+1; col++){     //increasing triangel == col<=row
                System.out.print(col);                 //decreasing triangle == col<=n-row+1
            }
            System.out.println();
        }
    }
}