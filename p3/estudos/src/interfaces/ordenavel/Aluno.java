package interfaces.ordenavel;

public class Aluno implements Ordenavel {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public int comparar(Object outro) {
        Aluno a = (Aluno) outro;

        if (this.nota < a.nota)
            return -1;
        else if (this.nota > a.nota)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return nome + " - Nota: " + nota;
    }
}