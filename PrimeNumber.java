public class PrimeNumber {
    public static void main(String[] args) {
        int a = 7;
        int i, count = 0;
        for (i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
