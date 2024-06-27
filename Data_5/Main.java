import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        OffsetDateTime now = OffsetDateTime.now();

        //verificare che la prima data è precedente alla seconda
        String isBefore = Boolean.toString(data1.isBefore(data2));
        String isAfter = Boolean.toString(data2.isAfter(data1));
        String isEqual1 = Boolean.toString(data1.isEqual(now));
        String isEqual2 = Boolean.toString(data2.isEqual(now));
        System.out.println("The data " + data1 + " is before " + data2 + "? " + isBefore.toUpperCase());

        //verificare che la seconda data è successiva alla prima
        System.out.println("The data " + data2 + " is after " + data1 + "? " + isAfter.toUpperCase());

        //verificare che le due date sono uguali ad ora
        System.out.println("The data " + data1 + " is the same of " + now + "? " + isEqual1.toUpperCase());
        System.out.println("The data " + data2 + " is the same of " + now + "? " + isEqual2.toUpperCase());
    }
}
