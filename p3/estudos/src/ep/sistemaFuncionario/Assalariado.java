package ep.sistemaFuncionario;

public class Assalariado extends Funcionario {

    public Assalariado(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}