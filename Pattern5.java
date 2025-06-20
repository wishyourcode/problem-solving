public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for(int row =0; row < 2*n; row ++){
            if(row<=n){
            for(int coll=0; coll< row; coll++){
                System.out.print("*");
            }
            System.out.println("");
        }
        else{
            for(int coll=n; coll>row-n; coll--){
                System.out.print("*");
            }
            System.out.println("");
        }
        }
    }
    }
