public class Main {
    public static void main(String[] args) {
        int num1 = 2, num2 = 5;
        char ch1 = 'z';
        Integer num3 = 7, num4 = 19;
        Character ch2 = 't';

        sumInt(num1, num2);
        printCh(ch1);
        sumInteger(num3, num4);
        printCharacter(ch2);

        System.out.println("\n");

        int intValue = 12;
        Integer integerValue = intValue;
        double doubleValue1 = 12.456;
        Double doubleValue2 = doubleValue1;
        char charValue = 'g';
        Character characterValue = charValue;

        System.out.println("Integer value: " + integerValue);
        System.out.println("Double value: " + doubleValue2);
        System.out.println("Character value: " + characterValue);
        System.out.println("\n");

        int integerBox = integerValue;
        double doubleBox = doubleValue2;
        char charBox = characterValue;

        System.out.println("Int value: " + integerBox);
        System.out.println("Double value: " + doubleBox);
        System.out.println("Char value: " + charBox);
    }

    public static void sumInt(int a, int b) {
        System.out.println("The sum is " + (a + b));
    }

    public static void printCh(char c) {
        System.out.println("The character is " + c);
    }

    public static void sumInteger(Integer a, Integer b) {
        System.out.println("The sum is " + (a + b));
    }

    public static void printCharacter(Character c) {
        System.out.println("The character is " + c);
    }
}
