public class isPowerOf2 {
    public static void main(String[] args) {
        int n =5343;
        int base = 10;
        int ans = (int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
}
