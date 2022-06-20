import java.util.Scanner;

public class Quadratic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter value of a: ");
        int a = sc.nextInt();
        System.out.print(" Enter value of b: ");
        int b = sc.nextInt();
        System.out.print(" Enter value of c: ");
        int c = sc.nextInt();
        int delta = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println(" The first root is: " + root1);
        System.out.println(" The second root is: " + root2);
        sc.close();

}
}
