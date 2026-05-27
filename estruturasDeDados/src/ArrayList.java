import java.util.List;

public class ArrayList {
    static void main(String[] args) {
      /*
      Crie um programa que:
        Adicione 5 nomes em um ArrayList
        Mostre todos os nomes
        Mostre o tamanho da lista
        Remova um nome
        Verifique se um nome específico existe
       */
        boolean existe = false;

        List<String> Nomes = new java.util.ArrayList<>();

        Nomes.add("gustavo");
        Nomes.add("iron");
        Nomes.add("coyote");
        Nomes.add("matheus");
        Nomes.add("batista");

        for (String x : Nomes){
            System.out.println(x);
        }

        System.out.println(Nomes.size());

        for (String nome : Nomes) {
            if (nome.equals("iron")) {
                existe = true;
                System.out.println(existe);
            }
        }

    }
}
