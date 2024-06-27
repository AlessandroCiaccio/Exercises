import java.time.OffsetDateTime;

//## Classe Movie:
//        Crea una classe Movie che rappresenti un film.
//        Definisci gli attributi:
//        - title (titolo del film),
//        - releaseDate (data di uscita)
//        - watched (indica se il film è stato visto o meno).
//        - Implementa un costruttore che accetti il titolo, la data di uscita e lo stato di visione come parametri.
//        Fornisci metodi pubblici (getter e setter) per tutti gli attributi definiti.
public class Movie {
    private String title;
    private OffsetDateTime exitDate;
    private Boolean watched;

    public Movie(String title, OffsetDateTime exitDate, Boolean watched) {
        this.title = title;
        this.exitDate = exitDate;
        this.watched = watched;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OffsetDateTime getExitDate() {
        return exitDate;
    }

    public void setExitDate(OffsetDateTime exitDate) {
        this.exitDate = exitDate;
    }

    public Boolean getWatched() {
        return watched;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", exitDate=" + exitDate +
                ", watched=" + watched +
                '}';
    }
}
