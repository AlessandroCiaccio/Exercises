import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        data.plusYears(1).minusMonths(1).plusDays(7);
        String dataItaly = data.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ITALY));
        System.out.println(dataItaly);
    }
}
