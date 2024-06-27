public class Main {
    public static void main(String[] args) {
        int num = 5;
        div(num);
    }

    public static void div(int num) {
        try {
            float division = num / 0;
        } catch (ArithmeticException e) {
            System.out.println("La divisione da l'errore: " + e);
        }
    }
}
