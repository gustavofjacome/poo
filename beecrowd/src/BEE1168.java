import java.io.IOException;
import java.util.Scanner;

public class BEE1168 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String sequenciaNumerica = sc.next();
            int soma = 0;

            for (int j = 0; j < sequenciaNumerica.length(); j++) {
                int digito = sequenciaNumerica.charAt(j) - '0';

                if (digito == 1) {
                    soma += 2;
                } else if (digito == 2 || digito == 3 || digito == 5) {
                    soma += 5;
                } else if (digito == 4) {
                    soma += 4;
                } else if (digito == 6 || digito == 9 || digito == 0) {
                    soma += 6;
                } else if (digito == 7) {
                    soma += 3;
                } else if (digito == 8) {
                    soma += 7;
                }
            }

            System.out.println(soma + " leds");
        }

        sc.close();
    }
}