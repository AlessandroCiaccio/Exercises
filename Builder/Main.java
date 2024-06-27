public class Main {
    public static void main(String[] args) {
        PersonBuilder builder1 = new PersonBuilder("Paolo", "Lupo");

        builder1.setAge(22);
        builder1.setAddress("Via Milano 22");
        Person person1 = builder1.build();
        System.out.println(person1);

        PersonBuilder builder2 = new PersonBuilder("Luca", "Paglia");
        Person person2 = builder2.build();
        System.out.println(person2);
    }
}
