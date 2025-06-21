public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
    static void pattern(int n){
        for(int row =n; row>0; row--){
            for(int space =0; space<row; space++){
                System.out.print(" ");
            }
            for(int coll=n; coll>=row; coll--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
