import java.util.Scanner;
public class findarea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = in.nextDouble();
       double result = areaOfCircle(radius);
        in.close();
        System.out.println("The area of the circle with radius 5 is: " + result);
    }
    static double areaOfCircle(double radius){
        return Math.PI * radius * radius;
    }
}
