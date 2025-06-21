public class Pattern10 {
        public static void main(String[] args) {
        pattern(11);
    }
    static void pattern(int n) {
        for (int row = n; row>0; row--) {
            if (row % 2 != 0) {
                for (int space =n; space> row; space--) {
                    System.out.print(" ");
                }
                for (int coll =0; coll< row; coll++) {
                    System.out.print(" * ");
                }
            } else {
                continue;
            }
            System.out.println("");
        }
    }
}
