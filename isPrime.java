public class isPrime {

    public static void main(String[] args) {
        System.out.println(isprime(23));
    }

    static boolean isprime(int n) {
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}