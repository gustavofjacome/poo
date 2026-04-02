import java.io.IOException;
import java.util.Scanner;


public class BEE1075 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        for (int i = 1; i < 10000; i++) {
            if (i % input == 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }

}