import java.time.OffsetDateTime;

//# Traccia : Applicazione Java per la Gestione di una Lista di Film
//        ## Classe Movie:
//        Crea una classe Movie che rappresenti un film.
//        Definisci gli attributi:
//        - title (titolo del film),
//        - releaseDate (data di uscita)
//        - watched (indica se il film è stato visto o meno).
//        - Implementa un costruttore che accetti il titolo, la data di uscita e lo stato di visione come parametri.
//        Fornisci metodi pubblici (getter e setter) per tutti gli attributi definiti.
//
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
//
//        ## Test:
//        - Utilizza il metodo main per testare tutte le funzionalità dell'applicazione.
//        - Assicurati che l'aggiunta, la rimozione, la visualizzazione e la marcatura dei film come visti funzionino correttamente.
//        - Testa anche le funzionalità bonus, verificando la visualizzazione dettagliata di un film e l'elenco dei film usciti negli ultimi 30 giorni.
//        ## Bonus Avanzato - Test Unitari:
//        - Aggiungi almeno due test unitari per verificare il funzionamento del metodo che visualizza i film usciti negli ultimi 30 giorni.
//        - Assicurati che i test coprano scenari diversi, come film usciti esattamente 30 giorni fa, film usciti oggi, ecc.
public class Main {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        Movie jumanji = new Movie("Jumanji", OffsetDateTime.now(),true);
        Movie jumanji2 = new Movie("Jumanji2", OffsetDateTime.now(),false);
        list.addMovieToList(jumanji);
        list.addMovieToList(jumanji2);
        list.seeListofMovie();
        list.seeOrNot(jumanji2,true);
        list.seeListofMovie();
    }
}
