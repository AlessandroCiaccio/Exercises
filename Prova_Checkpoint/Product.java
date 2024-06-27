public class Product {
    private String name;
    private String manufacturer;
    private long id;
    private int quantity;

    public Product(String name, String manufacturer, long id, int quantity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void printManifacturerFirstLetters(Product[] products){
        for(Product product : products){
            System.out.println(product.manufacturer.charAt(0));
        }
    }
}
