public class Item {
    private String productName;
    private int quantity;
    private double price;

    Item(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        String s = this.productName + ":";
        s = s + this.quantity + "\n'";
        return s;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

}
