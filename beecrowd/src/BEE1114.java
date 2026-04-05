import java.io.IOException;
import java.util.Scanner;


public class BEE1114 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int inputSenha;
        do {
            inputSenha = sc.nextInt();
            if (inputSenha != SENHA) {
                System.out.println("Senha Invalida");
            }
        } while (inputSenha != SENHA);
        System.out.println("Acesso Permitido");
    }

    public static final int SENHA = 2002;
}