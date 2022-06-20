import java.util.Scanner;

public class Distance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter of point x is:");
        int x = sc.nextInt();
        System.out.println("enter of point y is:");
        int  y = sc.nextInt();
        double  distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The distance is: " + distance);

        }
}
