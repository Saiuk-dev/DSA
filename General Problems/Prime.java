public class Prime {

    public static void primeTillN(int n) {

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        primeTillN(20);
    }
}
