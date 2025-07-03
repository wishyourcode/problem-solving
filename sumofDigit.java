public class sumofDigit {
    public static void main(String[] args) {
        System.out.println(digitsum(12345));
        System.out.println(productDigit(12340));
    }
    static int digitsum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + digitsum(n/10);
    }
    static int productDigit(int n){
        if(n==0){
            return 1;
        }
        return n%10 * productDigit(n/10);
    }
}
