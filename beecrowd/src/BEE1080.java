import java.io.IOException;
import java.util.Scanner;

//maior e posição
public class BEE1080 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[100];
        int maior;
        int indice;

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = sc.nextInt();
            sc.nextLine();
        }

        maior = maior(arrayNum);
        indice = indiceElemento(maior, arrayNum);

        System.out.println(maior);
        System.out.println(indice);



    }

    public static int maior(int[] lista){
        int maiorElemento = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > maiorElemento){
                maiorElemento = lista[i];
            }
        }
    return maiorElemento;
    }

    public static int indiceElemento(int x, int[] lista){
        int indice = 0;
        for (int i = 0; i < lista.length; i++) {
            if (x == lista[i]){
                indice = i;
            }
        }
        return indice+1;
    }
}