import java.util.Scanner;

public class main {
    static void main(String[] args) {
        int p, r;
        Scanner sc = new Scanner(System.in);

        p = sc.nextInt();
        r = sc.nextInt();

        if (p == 0){
            System.out.println("C");
        } else if (r == 0) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

    }
}
