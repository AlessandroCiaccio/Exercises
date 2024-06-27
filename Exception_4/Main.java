public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 6;
        div(array, index);
    }

    public static void div(int[] array, int index) {
        try {
            int division = array[index] / 0;
        } catch (ArithmeticException es) {
            System.out.println("Error: " + es);
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }
}
