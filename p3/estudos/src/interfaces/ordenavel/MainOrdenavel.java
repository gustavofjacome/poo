package interfaces.ordenavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainOrdenavel {

    public static void main(String[] args) {

        Produto[] produtos = {
                new Produto("Mouse", 50),
                new Produto("Teclado", 1200),
                new Produto("Monitor", 900)
        };

        Aluno[] alunos = {
                new Aluno("gustavo", 50),
                new Aluno("pedro", 1200),
                new Aluno("gabriela", 900)
        };

        ordenar(produtos);
        ordenar(alunos);

        Arrays.stream(produtos).forEach(System.out::println);
        Arrays.stream(alunos).forEach(System.out::println);

    }

    public static void ordenar(Ordenavel[] vetor) {

        for (int i = 0; i < vetor.length - 1; i++) {

            for (int j = 0; j < vetor.length - 1 - i; j++) {

                if (vetor[j].comparar(vetor[j + 1]) > 0) {

                    Ordenavel aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}
