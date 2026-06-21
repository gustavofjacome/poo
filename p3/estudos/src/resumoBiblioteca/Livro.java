package resumoBiblioteca;

import java.util.List;

public class Livro extends Material implements Avaliavel{
    private int paginas;
    private List<Integer> avaliacoes;


    @Override
    public void avaliar(int nota){
        avaliacoes.add(nota);
    }

    @Override
    public double calcularTaxaEmprestimo() {
        return 2.00;
    }

    @Override
    public double getMediaAvaliacoes(){
        int soma;
        soma = avaliacoes.stream().reduce(0, Integer::sum);

        return (double) soma /avaliacoes.size();
    }
}
