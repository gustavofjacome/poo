import java.io.IOException;
import java.util.Scanner;

public class BEE1087 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Cordenada inicio = new Cordenada();
        Cordenada fim = new Cordenada();

        int movimentos;

        while (true) {

            inicio.x = sc.nextInt();
            inicio.y = sc.nextInt();
            fim.x = sc.nextInt();
            fim.y = sc.nextInt();

            if (inicio.x == 0 && inicio.y == 0 && fim.x == 0 && fim.y == 0) {
                break;
            }

            if (inicio.x == fim.x && inicio.y == fim.y) {
                movimentos = 0;
            } else if (inicio.x == fim.x || inicio.y == fim.y) {
                movimentos = 1;
            } else if (Math.abs(inicio.x - fim.x) == Math.abs(inicio.y - fim.y)) {
                movimentos = 1;
            } else {
                movimentos = 2;
            }

            System.out.println(movimentos);
        }
    }
}

class Cordenada {
    int x, y;
}