package ep;

import java.util.*;
import java.util.stream.Collectors;

public class streams {

    static class Aluno {
        private String nome;
        private double nota;
        private int idade;

        public Aluno(String nome, double nota, int idade) {
            this.nome = nome;
            this.nota = nota;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public double getNota() {
            return nota;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            return nome + " (" + nota + ")";
        }
    }

    public static void main(String[] args) {

        List<Aluno> alunos = List.of(
                new Aluno("Ana", 8.5, 20),
                new Aluno("Pedro", 6.0, 22),
                new Aluno("Maria", 9.0, 19),
                new Aluno("João", 7.0, 21)
        );

        alunos.stream();

        List<Aluno> aprovados =
                alunos.stream()
                        .filter(a -> a.getNota() >= 7)
                        .toList();

        /*
         * ============================================================
         * MAP
         * Transforma elementos
         * ============================================================
         */

        List<String> nomes =
                alunos.stream()
                        .map(Aluno::getNome)
                        .toList();

        List<Double> notas =
                alunos.stream()
                        .map(Aluno::getNota)
                        .toList();

        /*
         * ============================================================
         * SORTED
         * Ordenação
         * ============================================================
         */

        List<Aluno> porNome =
                alunos.stream()
                        .sorted(Comparator.comparing(Aluno::getNome))
                        .toList();

        List<Aluno> porNota =
                alunos.stream()
                        .sorted(Comparator.comparing(Aluno::getNota))
                        .toList();

        List<Aluno> porNotaDecrescente =
                alunos.stream()
                        .sorted(Comparator.comparing(Aluno::getNota).reversed())
                        .toList();

        /*
         * ============================================================
         * DISTINCT
         * Remove duplicados
         * ============================================================
         */

        List<Integer> semDuplicados =
                List.of(1,1,2,2,3,3)
                        .stream()
                        .distinct()
                        .toList();

        /*
         * ============================================================
         * LIMIT
         * Primeiros N elementos
         * ============================================================
         */

        alunos.stream()
                .limit(2)
                .toList();

        /*
         * ============================================================
         * SKIP
         * Ignora N elementos
         * ============================================================
         */

        alunos.stream()
                .skip(2)
                .toList();

        /*
         * ============================================================
         * FOREACH
         * Percorrer elementos
         * ============================================================
         */

        alunos.stream()
                .forEach(System.out::println);

        /*
         * ============================================================
         * COUNT
         * Contagem
         * ============================================================
         */

        long quantidade =
                alunos.stream()
                        .count();

        /*
         * ============================================================
         * FIND FIRST
         * Primeiro elemento
         * ============================================================
         */

        Optional<Aluno> primeiro =
                alunos.stream()
                        .findFirst();

        /*
         * ============================================================
         * ANY MATCH
         * Existe algum?
         * ============================================================
         */

        boolean existeAprovado =
                alunos.stream()
                        .anyMatch(a -> a.getNota() >= 7);

        /*
         * ============================================================
         * ALL MATCH
         * Todos satisfazem?
         * ============================================================
         */

        boolean todosAprovados =
                alunos.stream()
                        .allMatch(a -> a.getNota() >= 7);

        /*
         * ============================================================
         * NONE MATCH
         * Nenhum satisfaz?
         * ============================================================
         */

        boolean nenhumReprovado =
                alunos.stream()
                        .noneMatch(a -> a.getNota() < 7);

        /*
         * ============================================================
         * MAX
         * Maior elemento
         * ============================================================
         */

        Optional<Aluno> melhorAluno =
                alunos.stream()
                        .max(
                                Comparator.comparing(
                                        Aluno::getNota
                                )
                        );

        /*
         * ============================================================
         * MIN
         * Menor elemento
         * ============================================================
         */

        Optional<Aluno> piorAluno =
                alunos.stream()
                        .min(
                                Comparator.comparing(
                                        Aluno::getNota
                                )
                        );

        /*
         * ============================================================
         * REDUCE
         * Acumulação
         * ============================================================
         */

        int soma =
                List.of(1,2,3,4,5)
                        .stream()
                        .reduce(
                                0,
                                Integer::sum
                        );

        int produto =
                List.of(1,2,3,4)
                        .stream()
                        .reduce(
                                1,
                                (a,b) -> a * b
                        );

        /*
         * ============================================================
         * SUM
         * ============================================================
         */

        double somaNotas =
                alunos.stream()
                        .mapToDouble(
                                Aluno::getNota
                        )
                        .sum();

        /*
         * ============================================================
         * AVERAGE
         * ============================================================
         */

        double media =
                alunos.stream()
                        .mapToDouble(
                                Aluno::getNota
                        )
                        .average()
                        .orElse(0);

        /*
         * ============================================================
         * COLLECT -> LIST
         * ============================================================
         */

        List<String> listaNomes =
                alunos.stream()
                        .map(Aluno::getNome)
                        .collect(Collectors.toList());

        /*
         * ============================================================
         * COLLECT -> SET
         * ============================================================
         */

        Set<String> conjuntoNomes =
                alunos.stream()
                        .map(Aluno::getNome)
                        .collect(Collectors.toSet());

        /*
         * ============================================================
         * COLLECT -> MAP
         * ============================================================
         */

        Map<String, Double> mapaNotas =
                alunos.stream()
                        .collect(
                                Collectors.toMap(
                                        Aluno::getNome,
                                        Aluno::getNota
                                )
                        );

        /*
         * ============================================================
         * GROUPING BY
         * ============================================================
         */

        Map<Boolean, List<Aluno>> grupos =
                alunos.stream()
                        .collect(
                                Collectors.groupingBy(
                                        a -> a.getNota() >= 7
                                )
                        );

        /*
         * ============================================================
         * JOINING
         * ============================================================
         */

        String nomesJuntos =
                alunos.stream()
                        .map(Aluno::getNome)
                        .collect(
                                Collectors.joining(", ")
                        );

        /*
         * ============================================================
         * OPTIONAL
         * ============================================================
         */

        Optional<Aluno> aluno =
                alunos.stream()
                        .filter(a -> a.getNome().equals("Carlos"))
                        .findFirst();

        Aluno resultado =
                aluno.orElse(
                        new Aluno("Padrão", 0, 0)
                );

        /*
         * ============================================================
         * QUESTÃO CLÁSSICA DE PROVA
         * ============================================================
         */

        List<String> resposta =
                alunos.stream()
                        .filter(a -> a.getNota() >= 7)
                        .sorted(
                                Comparator.comparing(
                                        Aluno::getNome
                                )
                        )
                        .map(Aluno::getNome)
                        .toList();

        /*
         * ============================================================
         * ORDEM DE EXECUÇÃO MAIS COMUM
         * ============================================================
         *
         * lista.stream()
         *      .filter(...)
         *      .sorted(...)
         *      .map(...)
         *      .toList();
         *
         * ============================================================
         * DECORAR PARA A PROVA
         * ============================================================
         *
         * filter()     -> filtra
         * map()        -> transforma
         * sorted()     -> ordena
         * distinct()   -> remove duplicados
         * count()      -> conta
         * findFirst()  -> primeiro elemento
         * max()        -> maior
         * min()        -> menor
         * reduce()     -> acumula
         * anyMatch()   -> existe algum?
         * allMatch()   -> todos?
         * noneMatch()  -> nenhum?
         * collect()    -> cria coleção
         * groupingBy() -> agrupa
         * joining()    -> junta strings
         * sum()        -> soma
         * average()    -> média
         *
         */
    }
}