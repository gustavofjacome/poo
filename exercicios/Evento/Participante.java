import java.util.Objects;

public class Participante {
    String cpf;
    String nome;
    String email;

    public Participante() {
    }

    public Participante(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return """
            =========================
            Participante
            =========================
            Nome  : %s
            CPF   : %s
            Email : %s
            """.formatted(nome, cpf, email);
    }
}
