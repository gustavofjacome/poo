package ep.sistemaFuncionario;

public class Comissionado extends Funcionario {

    private double vendas;
    private static final double COMISSAO = 0.10;

    public Comissionado(String nome, double salarioBase, double vendas) {
        super(nome, salarioBase);
        this.vendas = vendas;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (vendas * COMISSAO);
    }
}