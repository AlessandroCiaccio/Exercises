import java.util.ArrayList;

//        ## Classe MovieList:
//        - Crea una classe MovieList che gestisca una lista di film.
//        - Implementa un'ArrayList per memorizzare i film.
//        ### Fornisci metodi per:
//        - Aggiungere un nuovo film alla lista.
//        - Rimuovere un film dalla lista.
//        - Visualizzare l'elenco completo dei film.
//        - Contrassegnare un film specifico come visto.
//        ### Funzionalità Bonus:
//        - Implementa una funzionalità per visualizzare il dettaglio di un film specifico, identificato attraverso un parametro.
//        - Aggiungi la possibilità di visualizzare i film usciti negli ultimi 30 giorni, formattando la data in un formato leggibile.
public class MovieList {
    private ArrayList<Movie> list = new ArrayList<Movie>();

    public void addMovieToList(Movie movie) {
        list.add(movie);
    }

    public void removeMovieFromList(Movie movie) {
        list.remove(movie);
    }

    @Override
    public String toString() {
        return "MovieList{" +
                "list=" + list +
                '}';
    }

    public void seeListofMovie() {
        System.out.println(list);
    }

    public Boolean seeOrNot(Movie movie, Boolean see) {
        if (list.contains(movie)) {
            list.remove(movie);
            movie.setWatched(see);
            list.add(movie);
            return true;
        } else {
            return false;
        }
    }
}
