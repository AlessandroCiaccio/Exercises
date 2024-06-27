import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation between:" +
                "  ADDITION," +
                "  SUBTRACTION," +
                "  MULTIPLICATION," +
                "  DIVISION," +
                "  MIN," +
                "  MAX");
        String operation = scanner.next();
        Operation op = Operation.valueOf(operation);

        System.out.println("Input number 1: ");
        BigDecimal number1=scanner.nextBigDecimal();
        System.out.println("input number 2: " );
        BigDecimal number2=scanner.nextBigDecimal();
        System.out.println("Result: " + calculation(number1,number2,op));
    }

    public static BigDecimal calculation(BigDecimal number1, BigDecimal number2, Operation operation) {
        switch (operation) {
            case ADDITION:
                return number1.add(number2);
            case SUBTRACTION:
                return number1.subtract(number2);
            case MULTIPLICATION:
                return number1.multiply(number2);
            case DIVISION:
                return number1.divide(number2, RoundingMode.HALF_UP);
            case MIN:
                return number1.min(number2);
            case MAX:
                return number1.max(number2);
            default:
                throw new IllegalArgumentException("Not valid");
        }
    }
}
