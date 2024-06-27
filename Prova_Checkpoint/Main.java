public class Main {
    public static void main(String[] args) {
        float sum = 0;
        int counter = 0;
        Product latte = new Product("Latte", "Sole", 1, 5);
        Product farina = new Product("Farina", "Conad", 2, 3);
        Product riso = new Product("Riso", "Basmati", 3, 8);
        Product[] products = {latte, farina, riso};

        Product.printManifacturerFirstLetters(products);
        for (Product i : products) {
            sum += i.getQuantity();
            counter++;
        }
        System.out.println("The average quantity between the products is " + sum / counter);
    }
}
