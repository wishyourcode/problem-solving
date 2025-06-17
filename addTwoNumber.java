import java.util.*;
public class addTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        int sum = a+b;
        int subtract = a-b;
        int multiply = a*b;
        int divide = a/b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The difference of " + a + " and " + b + " is: " + subtract);
        System.out.println("The product of " + a + " and " + b + " is: " + multiply);
        System.out.println("The quotient of " + a + " and " + b + " is: " + divide);
        System.out.println("The modulus of " + a + " and " + b + " is: " + (a % b));
        System.out.println("The power of " + a + " raised to " + b + " is: " + Math.pow(a, b));
        System.out.println("The square root of " + a + " is: " + Math.sqrt(a));
        System.out.println("The square root of " + b + " is: " + Math.sqrt(b));
        System.out.println("The absolute value of " + a + " is: " + Math.abs(a));
        System.out.println("The absolute value of " + b + " is: " + Math.abs(b));
        System.out.println("The maximum of " + a + " and " + b + " is: " + Math.max(a, b));
        System.out.println("The minimum of " + a + " and " + b + " is: " + Math.min(a, b));
        System.out.println("The logarithm of " + a + " is: " + Math.log(a));
        System.out.println("The logarithm of " + b + " is: " + Math.log(b));
        System.out.println("The sine of " + a + " is: " + Math.sin(a));
        System.out.println("The sine of " + b + " is: " + Math.sin(b));
        System.out.println("The cosine of " + a + " is: " + Math.cos(a));
        System.out.println("The cosine of " + b + " is: " + Math.cos(b));
        System.out.println("The tangent of " + a + " is: " + Math.tan(a));
        System.out.println("The tangent of " + b + " is: " + Math.tan(b));
        System.out.println("The floor of " + a + " is: " + Math.floor(a));
        System.out.println("The floor of " + b + " is: " + Math.floor(b));
        System.out.println("The ceiling of " + a + " is: " + Math.ceil(a));
        System.out.println("The ceiling of " + b + " is: " + Math.ceil(b));
        System.out.println("The random number is: " + Math.random());   
        System.out.println("The random number between 0 and 100 is: " + (int)(Math.random() * 100));
        System.out.println("The random number between " + a + " and " + b + " is: " + (int)(Math.random() * (b - a + 1) + a));
        in.close();
    }
}
