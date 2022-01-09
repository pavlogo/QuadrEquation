import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {
    
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);
        System.out.println("Please insert a:");
        double a = z.nextDouble();
        System.out.println("Please insert b:");
        double b = z.nextDouble();
        System.out.println("Please insert c:");
        double c = z.nextDouble();

        double r = (b * b - 4 * a * c);

        if (r < 0)
            System.out.println("Equation has no roots");
        else {
            double root1 = (-b + Math.sqrt(r)) / (2 * a);
            double root2 = (-b - Math.sqrt(r)) / (2 * a);

            if (root2 != root1)
                System.out.println("Roots are: " + root2 + " and " + root1);
            if (root2 == root1)
                System.out.println("Root is: " + root2);
        }
    }
}
