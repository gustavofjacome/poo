import java.util.Scanner;

public class preprova {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        while (true){
            a = sc.nextInt();
            b = sc.nextInt();

            if (a > b){
                System.out.println("Decrescente");
            } else if (a < b) {
                System.out.println("Crescente");

            }
        }
    }
}
