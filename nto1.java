public class nto1 {
    public static void main(String[] args) {
        print_num(10);
        toN(10);
    }
    static void print_num(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print_num(n-1);
    }
    static void toN(int n){
        if(n==0){
            return;
        }
        toN(n-1);
        System.out.println(n);
    }
}
