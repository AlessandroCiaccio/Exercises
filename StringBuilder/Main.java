public class Main{

    public static void main(String[] args) {
        UnicodePrinter printer = new UnicodePrinter("Ciao Mondo!",8);
        printer.setInputString("Il lunedì è sempre una pessima giornata.");


        String result = printer.getUnicodeCharAtIndex(printer.index);
        System.out.println(result);

    }
}
