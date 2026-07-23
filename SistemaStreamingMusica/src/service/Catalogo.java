package service;

import domain.Midia;

import java.util.HashMap;
import java.util.Map;

public class Catalogo {
    private Map<String, Midia> indice = new HashMap<>();

    public Catalogo(Map<String, Midia> indice) {
        this.indice = indice;
    }

    public void indexar(Midia m){
        indice.put(m.getTitulo(), m);

    }

    public Midia buscarPorTitulo(String titulo){
        return indice.get(titulo);
    }

    public void listarTodos(){
        for (Midia x : indice.values()){
            System.out.println(x);
        }
    }


}
