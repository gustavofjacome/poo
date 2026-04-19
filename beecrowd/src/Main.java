import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int[][] board = new int[4][4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    board[i][j] = sc.nextInt();

            List<String> jogadas = new ArrayList<>();

            if (valida("DOWN"))  jogadas.add("DOWN");
            if (valida("LEFT"))  jogadas.add("LEFT");
            if (valida("RIGHT")) jogadas.add("RIGHT");
            if (valida("UP"))    jogadas.add("UP");

            if (jogadas.isEmpty())
                System.out.println("NONE");
            else
                System.out.println(String.join(" ", jogadas));
        }
    }

    static boolean valida(String direcao) {
        int[][] copia = copiar(board);
        mover(copia, direcao);
        return !igual(board, copia);
    }

    static void mover(int[][] b, String direcao) {
        if (direcao.equals("LEFT")) {
            for (int i = 0; i < 4; i++)
                b[i] = moverLinha(b[i]);
        } else if (direcao.equals("RIGHT")) {
            for (int i = 0; i < 4; i++) {
                b[i] = inverter(b[i]);
                b[i] = moverLinha(b[i]);
                b[i] = inverter(b[i]);
            }
        } else if (direcao.equals("UP")) {
            for (int j = 0; j < 4; j++) {
                int[] col = getColuna(b, j);
                col = moverLinha(col);
                setColuna(b, j, col);
            }
        } else if (direcao.equals("DOWN")) {
            for (int j = 0; j < 4; j++) {
                int[] col = getColuna(b, j);
                col = inverter(col);
                col = moverLinha(col);
                col = inverter(col);
                setColuna(b, j, col);
            }
        }
    }

    static int[] moverLinha(int[] linha) {
        int[] sem = new int[4];
        int idx = 0;
        for (int v : linha)
            if (v != 0) sem[idx++] = v;

        for (int i = 0; i < 3; i++) {
            if (sem[i] != 0 && sem[i] == sem[i + 1]) {
                sem[i] *= 2;
                sem[i + 1] = 0;
                i++;
            }
        }

        int[] resultado = new int[4];
        idx = 0;
        for (int v : sem)
            if (v != 0) resultado[idx++] = v;

        return resultado;
    }

    static int[] inverter(int[] linha) {
        int[] inv = new int[4];
        for (int i = 0; i < 4; i++)
            inv[i] = linha[3 - i];
        return inv;
    }

    static int[] getColuna(int[][] b, int j) {
        int[] col = new int[4];
        for (int i = 0; i < 4; i++) col[i] = b[i][j];
        return col;
    }

    static void setColuna(int[][] b, int j, int[] col) {
        for (int i = 0; i < 4; i++) b[i][j] = col[i];
    }

    static int[][] copiar(int[][] b) {
        int[][] c = new int[4][4];
        for (int i = 0; i < 4; i++)
            c[i] = Arrays.copyOf(b[i], 4);
        return c;
    }

    static boolean igual(int[][] a, int[][] b) {
        for (int i = 0; i < 4; i++)
            if (!Arrays.equals(a[i], b[i])) return false;
        return true;
    }
}