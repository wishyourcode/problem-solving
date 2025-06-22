public class Pattern11 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = n; row > 0; row--) {
            for (int space = n; space > row; space--) {
                System.out.print(" ");
            }
            for (int coll = 0; coll < row; coll++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        for(int row =0; row<n; row++){
            for(int space =1; space<n-row; space++){
                System.out.print(" ");
            }
            for(int coll =0; coll<row+1; coll++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
