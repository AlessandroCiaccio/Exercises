import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SetDiTest set = new SetDiTest();
        String obj = "Cookies";
        set.removeElementFromSet(obj);
        System.out.println(set.getSet());
        set.clearSet();
        System.out.println("The array is empty? " + set.getSet().isEmpty());
        System.out.println("Array: " + set.getSet());
    }
}
