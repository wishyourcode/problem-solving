public class noOfSet {
    public static void main(String[] args) {
        int count =0;
        int n =11;
        while(n>0){
            if((n&1)==1) {
                  count =count+1;  
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
