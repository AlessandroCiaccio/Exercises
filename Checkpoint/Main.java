//Creare un programma in Java che dato un array di interi abbia i seguenti metodi:
//
//
//a) Scrivere un metodo che a partire da un array calcoli il valore massimo e il valore minimo e
//stampi l’informazione a video.
//
//
//b) Scrivere un metodo che calcoli la somma di tutti i numeri pari all’interno dell’array e stampi l’informazione a video.

public class Main {
    public static void main(String[] args) {
        int lengthString = 5;
        String str = "Latte";
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        String[] vocabulary = {"Latte", "Formaggio", "Farina"};
        printMaxAndMin(array);
        sumEven(array);

        boolean isIn = isInArray(vocabulary, lengthString, str);
        System.out.println("There is " + str + " in the array? " + isIn);

        Docente docente1 = new Docente("Francesco", "Pizzuto", 1, 34);
        Docente docente2 = new Docente("Maria", "Motta", 3, 29);

        Docente[] docenti = {docente1, docente2};
        System.out.println("The minimum age of the professors is " + Universita.younger(docenti));

    }

    public static void printMaxAndMin(int[] array) {
        int max = 0, min = 100;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
    }

    public static void sumEven(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the even numbers is " + sum);
    }

    //a) Scrivere un metodo che ricerchi se una stringa di lunghezza definita dall’utente è contenuta o meno all’interno dell’array
// e che restituisca true o false come risultato della ricerca. Il risultato della ricerca dovrà essere stampato a video.
    public static boolean isInArray(String[] array, int dimension, String str) {
        boolean thereIs = false;
        for (String i : array) {
            if (i.length() == dimension && i.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
