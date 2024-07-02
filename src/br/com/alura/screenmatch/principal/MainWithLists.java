package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

import java.util.*;

public class MainWithLists {
    public static void main(String[] args) {
        Film myMovie = new Film("Um Sonho de Liberdade", 1994);
        myMovie.avalia(8.8);
        var filmeDoPaulo = new Film("Dogville", 2003);
        filmeDoPaulo.avalia(7.3);
        Serie mySerie = new Serie("Two and Half Men", 2003);
        mySerie.avalia(9.5);

        ArrayList<Title> watchedList = new ArrayList<>();
        watchedList.add(filmeDoPaulo);
        watchedList.add(myMovie);
        watchedList.add(mySerie);

        System.out.println("\n***********************************************************************\n");

        for (Title item: watchedList) {
            System.out.println(item.getNome());
            if (item instanceof Film movie && movie.getClassifier() > 2) {
                System.out.println("Classificação " + movie.getClassifier());
            }
        }

        System.out.println("\n***********************************************************************\n");

        List<String> searchForArtists = new ArrayList<>();
        searchForArtists.add("Sandra Bullock");
        searchForArtists.add("Dwanne Johnson");
        searchForArtists.add("Charlie Sheen");
        System.out.println(searchForArtists);

        Collections.sort(searchForArtists);
        System.out.println("After ordering: \n" + searchForArtists);

        System.out.println("Before ordering: \n" + watchedList);
        Collections.sort(watchedList);
        System.out.println("After ordering: \n" + watchedList);
        watchedList.sort(Comparator.comparing(Title::getAnoDeLacamento));
        System.out.println("Ordering by year");
        System.out.println(watchedList);
    }
}
