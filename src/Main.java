import br.com.alura.screenmatch.calculo.RecomendationFilter;
import br.com.alura.screenmatch.calculo.TimeCalculator;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n***********************************************************************\n");
        Film myMovie = new Film();
        myMovie.setNome("Um Sonho de Liberdade");
        myMovie.setAnoDeLacamento(1994);
        myMovie.setDuracaoEmMinutos(142);

        myMovie.exibeFichaTecnica();
        myMovie.avalia(9.6);
        myMovie.avalia(7.8);
        myMovie.avalia(8.7);

        System.out.println("Total de avaliações: " + myMovie.getTotalDeAvaliacoes());
        System.out.println("A média para o filme " + myMovie.getNome() + " ficou em " + myMovie.pegaMedia());

        System.out.println("\n***********************************************************************\n");

        Serie mySerie = new Serie();
        mySerie.setNome("Two and Half Men");
        mySerie.setAnoDeLacamento(2003);
        mySerie.setIncluidoNoPlano(true);
        mySerie.setAtiva(true);
        mySerie.setTemporadas(12);
        mySerie.setEpisodiosPorTemporada(14);
        mySerie.setMinutosPorEpisodio(22);
        mySerie.exibeFichaTecnica();
        System.out.println("Duração em minutos para maratonar " + mySerie.getNome() + " é de: " + mySerie.getDuracaoEmMinutos());

        mySerie.avalia(9.9);
        mySerie.avalia(8.9);
        mySerie.avalia(8.2);
        mySerie.avalia(7.9);

        System.out.println("Total de avaliações: " + mySerie.getTotalDeAvaliacoes());
        System.out.println("A média para " + mySerie.getNome() + " ficou em " + mySerie.pegaMedia());

        System.out.println("\n***********************************************************************\n");

        TimeCalculator calculator = new TimeCalculator();
        calculator.isIn(myMovie);
        calculator.isIn(mySerie);
        System.out.println("Tempo total: " + calculator.getTotalTime());

        System.out.println("\n***********************************************************************\n");

        RecomendationFilter filter = new RecomendationFilter();
        filter.filter(myMovie);

        System.out.println("\n***********************************************************************\n");

        Episode episode = new Episode();
        episode.setNumero(1);
        episode.setSerie(mySerie);
        episode.setTotalViews(100);
        filter.filter(episode);

    }

}
