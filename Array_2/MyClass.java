public class MyClass {
    public static void main(String args[]) {
      char[] arr={'a','b','a','d'};
      printOccurrences(arr);
      }
    
    public static void printOccurrences(char[] arr) {
        int count = 0;
        for (char c : arr) {
            if (c == 'a') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Il carattere 'a' appare " + count + " volte.");
        } else {
            System.out.println("Il carattere 'a' non appare nell'array.");
        }
    }
}