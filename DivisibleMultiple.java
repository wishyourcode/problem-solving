import java.util.Scanner;
public class DivisibleMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int a = in.nextInt();
        in.close();
        // if a numbber is divisible by any number then it will be the factor of ther number
        if(a%5==0){
            System.out.println(a+ " is divisible and multiple of 5");
        }else{
            System.out.println(a + " is not divisible and multiple of 5");
        }
    }
}
