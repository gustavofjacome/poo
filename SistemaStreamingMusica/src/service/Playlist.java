package service;

import domain.Midia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Midia> midias = new ArrayList<>();

    public Playlist(String nome) {
        this.nome = nome;
    }

    public void adicionar(Midia seraAdicionado){
        midias.add(seraAdicionado);
    }

    public boolean remover(String removerPorTitulo){
        Midia seraRemovido;

        for (Midia x : midias){
            if (removerPorTitulo.equals(x.getTitulo())){
                seraRemovido = x;
                midias.remove(x);
                return true;
            }
        }
        return false;
    }

    public void listar(){
        midias.forEach(System.out::println);
    }

    public int getDuracaoTotal(){
        int acumulador = 0;
        for (Midia x : midias){
            acumulador += x.getDuracao();
        }
        return acumulador;
    }

    public Midia getMidiaMaisLonga(){
        List<Midia> listaOrdenada;
        listaOrdenada = midias.stream().sorted(Comparator.comparing(Midia::getDuracao)).toList();
        return listaOrdenada.getLast();
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", midias=" + midias +
                '}';
    }
}
