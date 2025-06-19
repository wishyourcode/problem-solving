import java.util.*;
public class largestNuymber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = in.nextInt();
        System.out.println("Enter Second Number:");
        int b = in.nextInt();
        System.out.println("Enter First Number:");
        int c = in.nextInt();
        in.close();
        if(a>b && b>c){
            System.out.println(a+ " is Greatest Number");
        }else if (b>c){
            System.out.println(b+ " is Greatest Number");
        }
        else {
            System.out.println(c+ " is Greatest Number");
        }
    }    
}
