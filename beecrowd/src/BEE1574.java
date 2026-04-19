import java.util.Scanner;


public class BEE1574 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();

            int pos = 0;
            int[] moves = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                String line = sc.nextLine();

                if (line.equals("LEFT")) {
                    moves[i] = -1;
                } else if (line.equals("RIGHT")) {
                    moves[i] = 1;
                } else {
                    String[] partes = line.split(" ");
                    int ref = Integer.parseInt(partes[2]);
                    moves[i] = moves[ref];
                }

                pos += moves[i];
            }

            System.out.println(pos);
        }
    }
}