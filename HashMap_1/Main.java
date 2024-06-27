import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String,String> cars1=new HashMap<>();
        cars1.put("Hyundai","IX35");
        cars1.put("Ford","Focus");
        cars1.put("Opel","Astra");
        System.out.println(cars1);

        Map<String,String> cars2=Map.of(
                "Hyundai","IX35",
                "Ford","Focus",
                "Opel","Astra");
        System.out.println(cars2);

        Map<String,String> cars3=Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Hyundai","IX35"),
                new AbstractMap.SimpleEntry<>("Ford","Focus"),
                new AbstractMap.SimpleEntry<>("Opel","Astra")
        );
        System.out.println(cars3);
     }
}
