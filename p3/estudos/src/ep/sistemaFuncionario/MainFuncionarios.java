package ep.sistemaFuncionario;

import java.util.ArrayList;
import java.util.List;

public class MainFuncionarios {

    public static void main(String[] args) {

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add(new Assalariado("Ana", 3000.0));
        listaFuncionarios.add(new Comissionado("Bruno", 4000.0, 2000.0));
        listaFuncionarios.add(new Comissionado("Carla", 4500.0, 5000.0));

        imprimeFuncionarios(listaFuncionarios);
        maiorSalario(listaFuncionarios);
    }

    public static void imprimeFuncionarios(List<Funcionario> lista) {
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario);
        }
    }

    public static void maiorSalario(List<Funcionario> lista) {

        Funcionario maiorSalario = lista.getFirst();

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).calcularSalario() > maiorSalario.calcularSalario()) {
                maiorSalario = lista.get(i);
            }
        }

        System.out.println(
                "Maior salário: "
                        + maiorSalario.getNome()
                        + " ("
                        + maiorSalario.getClass().getSimpleName()
                        + ")"
        );
    }
}