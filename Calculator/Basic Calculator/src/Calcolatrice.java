
import java.util.Scanner;

public class Calcolatrice {

    Scanner scanner = new Scanner(System.in);
    public static void calcolatrice () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un carattere per l'operazione corrispondente :\n" +
                "+ per addizione\n" +
                "- per sottrazione\n" +
                "* per moltiplicazione\n" +
                "/ per divisione\n" +
                "^ per potenza\n" +
                "% per sapere se è pari o dispari");

        char segno = scanner.next().charAt(0);
        if (segno == '%') {
            System.out.println("Inserire il numero di cui si vuole sapere se è pari o dispari");
            float a = scanner.nextFloat();

        } else {
            System.out.println("Inserire il primo numero");
            float a = scanner.nextFloat();
            System.out.println("Inserire il secondo numero");
            float b = scanner.nextFloat();
            switch (segno) {
                case '+': {
                    System.out.println("Il risultato dell'addizione è" );
                    break;
                }
                case '-': {
                    System.out.println("Il risultato della sottrazione è" );
                    break;
                }
                case '*': {
                    System.out.println("Il risultato della moltiplicazione è " );
                    break;
                }
                case '/': {
                    System.out.println("Il risultato della divisione è" );
                    break;
                }
                case '^': {
                    System.out.println("Il risultato della potenza è" );
                    break;
                }
                default:{
                    System.out.println("Errore");
                }
            }
        }
    }
    public static void main(String[] args) {
        calcolatrice();

    }
}