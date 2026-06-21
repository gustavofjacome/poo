package interfaces.ordenavel;

public class Produto implements Ordenavel {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int comparar(Object outro) {
        Produto p = (Produto) outro;

        if (this.preco < p.preco)
            return -1;
        else if (this.preco > p.preco)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
