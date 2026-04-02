import java.io.IOException;
import java.util.Scanner;

public class BEE1014 {
    public static final double PI = 3.14159;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();

        System.out.printf("%.3f km/l\n", consumoMedio(a, b));

    }
    public static double consumoMedio(int distancia, double combustivel){
        return distancia/combustivel;
    }
}