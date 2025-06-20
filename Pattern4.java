public class Pattern4 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int row =0; row <n+1; row ++){
            for(int coll = 0; coll<row; coll++){
                System.out.print(coll+1+ " ");
            }
            System.out.println("");
        }
    }
}
