import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();
        Fruit fruit4 = new Fruit("Pera");
        Fruit fruit5 = new Fruit("Mandarino");
        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Arancia"));
        System.out.println(fruits);

        fruits.addFirst(fruit4);
        fruits.addLast(fruit5);
        System.out.println(fruits);
    }
}
