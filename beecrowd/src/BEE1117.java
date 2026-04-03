import java.io.IOException;
import java.util.Scanner;

public class BEE1117 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double a, b;

        a = lerNota(sc);
        b = lerNota(sc);

        System.out.println("media = " + media(a, b));
    }

    public static double lerNota(Scanner sc) {
        double n;
        while (true) {
            n = sc.nextDouble();
            if (n >= 0.0 && n <= 10.0) {
                return n;
            }
            System.out.println("nota invalida");
        }
    }

    public static double media(double x, double y){
        return (x + y)/2;
    }
}