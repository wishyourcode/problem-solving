public class Pattern7 {
    public static void main(String[] args) {
        pattern(6);
    }
// if print("*")
// ******
//  *****
//   ****
//    ***
//     **
//      *
// if print(" *")
//  * * * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
    static void pattern(int n){
        for(int row=n; row>0; row--){
            for(int space=n; space>row; space--){
                System.out.print(" ");
            }
            for(int coll =0; coll<row; coll++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
