public class UnicodePrinter {
    private String inputString;
    final int index;

    public UnicodePrinter(String inputString, int index) {
        this.inputString = inputString;
        this.index = index;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getUnicodeCharAtIndex(int index) {
        StringBuilder result = new StringBuilder();

        if (index >= 0 && index < inputString.length()) {
            char character = inputString.charAt(index);
            int unicodeValue = character;
            result.append("Il carattere alla posizione ")
                    .append(index)
                    .append(" è: ")
                    .append(character)
                    .append(", Unicode: ")
                    .append(unicodeValue);
        } else {
            result.append("Errore: l'indice specificato non è valido.");
        }

        return result.toString();
    }
}