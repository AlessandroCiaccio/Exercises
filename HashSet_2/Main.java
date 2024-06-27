import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> numbers = filling();
        System.out.println("Array: " + numbers);
        numbers.add(11);
        System.out.println("Updated array: " + numbers);
        Integer num = 11;
        verify(numbers, num);

    }

    public static Set<Integer> filling() {
        HashSet<Integer> array = new HashSet<Integer>();
        array.add(1);
        array.add(3);
        array.add(5);
        array.add(7);
        array.add(9);
        return array;
    }

    public static void verify(Set<Integer> array, Integer number) {
        if (array.contains(number)) {
            System.out.println("The element " + number + " is in the array.");
        } else {
            System.out.println("The element " + number + " isn't in the array.");
        }
    }
}
