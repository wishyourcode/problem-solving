public class oddEven {

    public static void main(String[] args) {
        System.out.println(isOdd(2));
    }
    static boolean isOdd(int n){
        return (n & 1) ==1;
    }
}