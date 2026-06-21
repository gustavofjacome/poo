package resumoBiblioteca;

import java.util.List;

public class Revista  extends Material implements Avaliavel {
    private int edicao;
    private List<Integer> avaliacoes;

    @Override
    public double calcularTaxaEmprestimo() {
        return 1.00;
    }

    @Override
    public void avaliar(int nota) {
        avaliacoes.add(nota);
    }

    @Override
    public double getMediaAvaliacoes() {
        int soma;
        soma = avaliacoes.stream().reduce(0,Integer::sum);

        return (double) soma /avaliacoes.size();
    }
}
