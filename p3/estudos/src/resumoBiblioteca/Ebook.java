package resumoBiblioteca;

import java.util.List;

public class Ebook extends Material implements Avaliavel {
    private double tamanhoMB;
    private List<Integer> avaliacoes;

    @Override
    public double calcularTaxaEmprestimo() {
        return 0.50;
    }

    @Override
    public void avaliar(int nota) {
        avaliacoes.add(nota);
    }

    @Override
    public double getMediaAvaliacoes() {
        int soma;
        soma = avaliacoes.stream().reduce(0, Integer::sum);
        return (double) soma/avaliacoes.size();
    }
}
