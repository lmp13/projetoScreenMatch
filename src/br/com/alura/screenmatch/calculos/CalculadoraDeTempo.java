package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    } Poderia fazer dessa forma, porém deixa o design de classes poluído. Nesse caso é mais interessante fazer da forma abaixo, utilizando a SuperClasse Titlo.

      public void inclui(Titulo titulo) {
          System.out.println("Adicionando duração em minutos de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
      }
}
