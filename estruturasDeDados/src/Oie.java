import java.util.Map;
import java.util.HashMap;

public class Oie {

    public static void main(String[] args) {

        Map<String, String> listaTelefonica = new HashMap<>();

        // adicionando contatos
        listaTelefonica.put("gustavo", "84999892578");
        listaTelefonica.put("gustavo2", "84981422400");
        listaTelefonica.put("pedro", "849985776893");
        listaTelefonica.put("gabi", "84985769125");
        listaTelefonica.put("alice", "8417256374");

        // buscando telefone
        String chave = "gustavo";

        if (listaTelefonica.containsKey(chave)) {

            String telefone = listaTelefonica.get(chave);

            System.out.println("Telefone de " + chave + ": " + telefone);
        }

        // removendo contato
        listaTelefonica.remove("pedro");

        // listando contatos
        System.out.println("\nLista telefônica:");

        for (Map.Entry<String, String> contato : listaTelefonica.entrySet()) {

            System.out.println(
                    contato.getKey() + " -> " + contato.getValue()
            );
        }
    }
}