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
        for(int row =0; row<n; row++){
            for(int space =n-row; space>1; space--){
                System.out.print(" ");
            }
            for(int coll=0; coll<=row; coll++){
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    }
}
