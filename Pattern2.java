public class Pattern2 {
    public static void main(String[] args) {
        pattern(6);
    }
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
    static void pattern(int n){
        for(int row =0; row<n; row++){
            for(int coll=0; coll< row; coll++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
