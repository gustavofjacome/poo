import java.io.IOException;
import java.util.Scanner;


public class BEE2165 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String texto;

        texto = sc.nextLine();

        if (texto.length() <= 140){
            System.out.println("TWEET");
        } else {
            System.out.println("MUTE");
        }
    }

}