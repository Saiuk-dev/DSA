public class SpacedT {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1; row <= n; row++) {

            // Print spaces
            for(int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print numbers
            for(int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}