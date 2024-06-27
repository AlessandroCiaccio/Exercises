import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> animals = Map.of(
                "Cat", "Persian",
                "Dog", "Labrador",
                "Hamster", "Syrian"
        );
        List<String> sortedValues=new ArrayList<>(animals.values());
        Collections.sort(sortedValues);
        System.out.println(sortedValues);

    }
}
