import java.util.*;
public class addTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        in.close();
    }
}
