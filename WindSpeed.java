import java.util.Scanner;

public class WindSpeed {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter value of temperature ");
        double t = sc.nextDouble();
        System.out.println("Enter value of velocity ");
        double v = sc1.nextDouble();
        double w = 35.74 + 0.6215 + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
        if (t <= 50 && v > 3 && v < 120) {
            System.out.println("effective temperature is: " + w);
        }
        else{
            System.out.println("values are out of range");
        }
    }
}
