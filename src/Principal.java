import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("Madagascar", 2005);
        meuFilme.setDuracaoEmMinutos(86);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Média de avaliações do filme: " + meuFilme.getTotalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2004);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(20);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Megamente", 2010);
        outroFilme.setDuracaoEmMinutos(95);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.getSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoLucas = new Filme("Operação Big Hero", 2014);//O "var" ajuda a simplificar a declaração de variáveis, permitindo que o compilador deduza automaticamente o tipo com base no valor atribuído.
        filmeDoLucas.setDuracaoEmMinutos(102);
        //filmeDoLucas.setNome("Operação Big Hero");
        filmeDoLucas.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLucas);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

    }

}