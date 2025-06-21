public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5);
    }
// *****
// *****
// *****
// *****
// *****
    static void pattern1(int n){
        for(int row =0; row< n; row++ ){
            for (int coll =0; coll<n; coll++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }  
}