public class Pattern9 {
    public static void main(String[] args) {
        pattern( 11);
    }
    static void pattern(int n){
        for(int row=n; row>0; row--){
            for(int space =0; space<row; space++){
                System.out.print(" ");
            }
            for(int coll=n;coll>row;coll--){
                if(row%2==0){
                    System.out.print(" * ");
                } 
                else{
                    continue;
                }  
            }
            System.out.println("");
        }
    }
}
