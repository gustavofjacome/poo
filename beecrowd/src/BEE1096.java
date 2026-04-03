import java.io.IOException;

public class BEE1096 {

    public static void main(String[] args) throws IOException {
        int i = 1;

        while (i <= 9) {
            int j = 7;

            while (j >= 5) {
                System.out.println("I=" + i + " J=" + j);
                j--;
            }

            i += 2;
        }
    }
}