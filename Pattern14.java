public class Pattern14 {
    public static void main(String[] args) {
        pattern(7);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = row; space < n; space++) {
                System.out.print(" ");
            }
            for (int coll = 1; coll <= (2 * row - 1); coll++) {
                if (coll == 1 || coll == (2 * row - 1) || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
