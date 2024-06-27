//Scrivere poi una classe Università che rappresenti un insieme di docenti universitari
// tramite un Array di tipo Docente e che contenga il costruttore, i metodi accessori ed un metodo che restituisce
// l’età minima tra i docenti universitari.
public class Universita {
    private Docente[] docenti;

    public Universita(Docente[] docenti) {
        this.docenti = docenti;
    }

    public Docente[] getDocenti() {
        return docenti;
    }

    public void setDocenti(Docente[] docenti) {
        this.docenti = docenti;
    }
    public static int younger(Docente[] docenti){
        int minAge=100;
        for (Docente i: docenti){
            if(i.getEta()<minAge){
                minAge=i.getEta();
            }
        }
        return minAge;
    }
}
