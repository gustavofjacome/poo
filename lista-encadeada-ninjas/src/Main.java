import java.util.LinkedList;

    public class Main {
        /* TODO
         * REMOVER PRIMEIRO NINJA
         * ADICIONAR UM NOVO NINJA NO INICIO
         * EXIBIR LISTA COMPLETA
         * ACESSAR NINJA EM POSÇÃO ESPECIFICA
         * */
        public static void main(String[] args) {
            LinkedList<Ninja> listaNinjas = new LinkedList<>();

            listaNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
            listaNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
            listaNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
            listaNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
            listaNinjas.add(new Ninja("Gaara", 17, "Areia"));
            listaNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
            listaNinjas.add(new Ninja("Temari", 18, "Areia"));

            removerPrimeiroNinja(listaNinjas);

            adicionarNoInicio(listaNinjas, new Ninja("tobirama", 40, "konoha"));

            exibirLista(listaNinjas);
        }

        public static void removerPrimeiroNinja(LinkedList listaEncadeada){
            listaEncadeada.pollFirst();
        }

        public static void adicionarNoInicio(LinkedList listaEncadeada, Ninja ninja){
            listaEncadeada.addFirst(ninja);
        }

        public static void exibirLista(LinkedList listaEncadeada){
            for (int i = 0; i < listaEncadeada.size(); i++) {
                System.out.println(listaEncadeada.get(i));
            }
        }

        public static void acessarNinja(LinkedList listaEncadeada, int indice){
            System.out.println(listaEncadeada.get(indice));
        }


    }