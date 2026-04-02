import java.io.IOException;
import java.util.Scanner;

public class BEE2454 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int R = sc.nextInt();

        System.out.println(caminhoBolinha(P == 1, R == 1));
    }

    public static char caminhoBolinha(boolean x, boolean y){
        char quedaBola;
        if (!x){
            quedaBola = 'C';
        } else if (!y) {
            quedaBola = 'B';
        } else {
            quedaBola = 'A';
        }
        return quedaBola;
    }
}