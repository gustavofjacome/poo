import java.io.IOException;
import java.util.Scanner;


public class BEE1020 {

    public static void main(String[] args) throws IOException {
        int dias;
        int meses;
        int anos;

        Scanner sc = new Scanner(System.in);

        dias = sc.nextInt();

        anos = dias/365;
        dias  = dias % 365;
        meses = dias/30;
        dias = dias%30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }

}