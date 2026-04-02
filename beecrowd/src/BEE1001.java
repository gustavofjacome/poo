import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class BEE1001 {

    public static void main(String[] args) throws IOException {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("X = " + soma(a,b));
    }


    public static int soma(int x, int y){
        return x+y;
    }
}