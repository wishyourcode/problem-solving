public class pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row=n; row>0; row--){
            for(int coll =0; coll < row; coll++){
                System.out.print(" ");
            }
            for (int coll =0; coll<n-row+1; coll++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
