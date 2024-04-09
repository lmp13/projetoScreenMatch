package principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Madagascar", 2005);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Megamente", 2010);
        meuFilme.avalia(10);
        var filmeDoLucas = new Filme("Operação Big Hero", 2014);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost", 2004);

        Filme f1 = filmeDoLucas;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoLucas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Rodrigo Santoro");
        buscaPorArtistas.add("Jim Carrey");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtistas);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
