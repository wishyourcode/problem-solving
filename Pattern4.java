public class Pattern4 {
    public static void main(String[] args) {
        pattern(6);
    }
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 
    static void pattern(int n){
        for(int row =0; row <n+1; row ++){
            for(int coll = 0; coll<row; coll++){
                System.out.print(coll+1+ " ");
            }
            System.out.println("");
        }
    }
}
