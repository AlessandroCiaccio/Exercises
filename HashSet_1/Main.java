import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> studenti = new HashSet<String>();
        studenti = fullSet(studenti);

        System.out.println("The length of the string is: "+studenti.size());
        System.out.println(studenti);
    }

    public static HashSet<String> fullSet(HashSet studenti) {
        studenti.add("Piero");
        studenti.add("Marco");
        studenti.add("Gianfranco");
        studenti.add("Luigi");
        return studenti;
    }
}

