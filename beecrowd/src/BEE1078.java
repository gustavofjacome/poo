import java.io.IOException;
import java.util.Scanner;


public class BEE1078 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        for (int i = 1; i < 11; i++) {
            System.out.println(i + " x " + input + " = " + multiplica(i,input));
        }
        sc.close();
    }

    public static int multiplica(int a, int b){
        return a*b;
    }

}