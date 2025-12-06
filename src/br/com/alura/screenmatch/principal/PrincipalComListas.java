package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão",1970);
        filme1.avalia(9);
        Filme filme2 = new Filme("A procura da felicidade",2006);
        filme2.avalia(9.5);
        var filme3 = new Filme("Indiana Jones",2023);
        filme3.avalia(8);
        Serie lost = new Serie("Lost",2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);
        for (Titulo item:lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao()>2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Juliana");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
