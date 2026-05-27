import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Musica> playlist = new ArrayList<>();

        Musica musicaRock = new Musica("Black No 1", "Type O Negative", 210);
        Musica musicaRap = new Musica("Peso", "a$ap Rocky", 230);
        Musica musicaTriste = new Musica("Boys dont cry", "The cure", 305);

        adicionaMusica(playlist, musicaRock);
        adicionaMusica(playlist, musicaRap);
        adicionaMusica(playlist, musicaTriste);

        removerMusica(playlist, "Black No 1");

        System.out.println(playlist);
    }


    public static void adicionaMusica(List<Musica> myPlaylist, Musica music) {
        myPlaylist.add(music);
        System.out.println("Item adicionado");
    }

    public static int duracaoTotal(List<Musica> myPlaylist) {
        int duracao = 0;
        for (int i = 0; i <myPlaylist.size(); i++) {
            duracao += myPlaylist.get(i).getDuracao();
        }
        return duracao;
    }

    public static void removerMusica(List<Musica> myPlaylist, String nomeMusica) {
        Musica removida = null;
        for (Musica musica : myPlaylist) {
            if (nomeMusica.equals(musica.getTitulo())) {
                removida = musica;
                myPlaylist.remove(removida);
                break;
            }
        }
        System.out.println("Item " + removida + " removido");
    }

    public static void exibirMaisLonga(List<Musica> myPlaylist) {
        int maiorDuracao = 0;

        for (Musica musica : myPlaylist) {
            if (musica.getDuracao() > maiorDuracao){
                maiorDuracao = musica.getDuracao();
            }
        }

        System.out.println("A música com maior duração é: " + maiorDuracao);
    }


}
