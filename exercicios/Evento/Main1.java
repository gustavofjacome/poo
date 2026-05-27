import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Participante p1 = new Participante("529.481.730-12", "Gustavo Almeida", "gustavo.almeida@email.com");
        Participante p2 = new Participante("184.920.650-77", "Mariana Costa", "mariana.costa@email.com");
        Participante p3 = new Participante("903.117.240-55", "Lucas Ferreira", "lucas.ferreira@email.com");
        Participante p4 = new Participante("671.308.990-41", "Ana Beatriz Lima", "ana.lima@email.com");
        Participante p5 = new Participante("248.556.170-09", "Carlos Eduardo", "carlos.edu@email.com");
        Participante p6 = new Participante("248.556.170-09", "Carlos Eduarda", "carlos.edu@email.com"); // duplicado


        boolean pertence;

        Set<Participante> evento = new HashSet<>();

        adicionaParticipante(p1, evento);
        adicionaParticipante(p2, evento);
        adicionaParticipante(p3, evento);
        adicionaParticipante(p4, evento);
        adicionaParticipante(p5, evento);
        adicionaParticipante(p6, evento);

        exibeTodos(evento);

        pertence = verificaSePertence(p6, evento);
        System.out.println(pertence);


        System.out.println("Total de participantes: " + evento.size());

    }

    public static void adicionaParticipante(Participante novoParticipante, Set<Participante> novoEvento){
        if (novoEvento.add(novoParticipante)){
            System.out.println("Participante adicionado com sucesso!");
        } else {
            System.out.println("Participante já cadastrado!");
        }
    }

    public static void exibeTodos(Set<Participante> novoEvento){
        for (Participante usuario : novoEvento){
            System.out.println(usuario);
        }
    }

    public static boolean verificaSePertence(Participante participante, Set<Participante> evento){
        return evento.contains(participante);
    }

}
