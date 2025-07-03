public class prodect {
    public static void main(String[] args) {
        System.out.println(product_to_n2(5));
        System.out.println(sum(10));
    }
    static int product_to_n(int n){
        if(n<2){
            return n;
        }
        int product =1;
        product = n* product_to_n(n-1);
        return product;
    }
    static int product_to_n2(int n){
        if(n<=1){
            return 1;
        }
        return n* product_to_n(n-1);
    }
        static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n + sum(n-1);
    }
}
