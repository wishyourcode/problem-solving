public class findUnique {
    public static void main(String[] args) {
        int [] arr= {-2,-3,-4,5,-4,-3,-2};
        int ans = unique(arr);
        System.out.println(ans);
        }
        static int unique(int[] arr) {
            int Unique =0;
            for(int n : arr){
                Unique^=n;
            }
            return Unique;
    }
}
