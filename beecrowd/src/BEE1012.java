import java.io.IOException;
import java.util.Scanner;

public class BEE1012 {
    public static final double PI = 3.14159;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", AreaTrianguloRetangulo(a,b,c));
        System.out.printf("CIRCULO: %.3f\n", AreaCirculo(a,b,c));
        System.out.printf("TRAPEZIO: %.3f\n", AreaTrapezio(a,b,c));
        System.out.printf("QUADRADO: %.3f\n", AreaQuadrado(a,b,c));
        System.out.printf("RETANGULO: %.3f\n", AreaRetangulo(a,b,c));



    }
    public static double AreaTrianguloRetangulo(double a, double b, double c){
        return (a*c)/2;
    }
    public static double AreaCirculo(double a, double b, double c){
        return (PI * (c*c));
    }
    public static double AreaTrapezio(double a, double b, double c){
        return ((a+b)*c)/2;
    }
    public static double AreaQuadrado(double a, double b, double c){
        return (b*b);
    }
    public static double AreaRetangulo(double a, double b, double c){
        return a*b;
    }
}