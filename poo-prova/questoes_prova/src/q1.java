import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        /*
        (3 pontos) [BEE 1164] Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores
        positivos próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo, o número 6 é perfeito, pois 1+2+3 é igual a 6.
        Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não.
         */
        Scanner sc = new Scanner(System.in);
        List<Integer> divisores = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n%i == 0){
                divisores.add(i);
            }
        }
        int soma;
        soma = divisores.stream().mapToInt(Integer::intValue).sum();

        if (soma == n){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
