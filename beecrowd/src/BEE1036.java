import java.io.IOException;
import java.util.Scanner;

public class BEE1036 {

    public static void main(String[] args) throws IOException {

        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double x1;
        double x2;
        double delta;
        delta = delta(a,b,c);

        if (delta < 0){
            System.out.println("Impossivel calcular");

        } else if (a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            x1 = ((-b + Math.sqrt(delta))/(2*a));
            x2 = ((-b - Math.sqrt(delta))/(2*a));

            System.out.printf("R1 = %.5f\n",x1 );
            System.out.printf("R2 = %.5f\n",x2 );
        }
    }

    public static double delta(double a, double b, double c){
        double delta = ((b*b) - 4 * a * c);
        return delta;
    }
}