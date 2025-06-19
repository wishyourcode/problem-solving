public class swapNumber {
    public static void main(String[] args) {
        System.out.print(swap(10,20));
    }
    static String swap(int i, int j) {
     int temp = i;
     i = j;
     j = temp;
     return i + " " + j;
    }
}
