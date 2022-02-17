import java.util.ArrayList;
import java.util.ListIterator;

public class Receipt {
    ArrayList<Item> item;
    double totalPrice;
    double payablePrice;
    double discount;
    double card;

    Receipt() {
        this.item = new ArrayList<Item>();
        this.totalPrice = 0;
        this.payablePrice = 0;
        this.discount = 0;
        this.card = 0;

    }

    public void addToReceipt(Item item) {
        this.item.add(item);
    }

    public void showReceipt() {
        ListIterator<Item> iterator = item.listIterator();
        while (iterator.hasNext()) {
            Item item1 = iterator.next();
            System.out.println(item1);
        }
    }

    public double getTotalPrice() {
        ListIterator<Item> iterator2 = item.listIterator();
        this.totalPrice = 0;
        while (iterator2.hasNext()) {
            Item item3 = iterator2.next();
            this.totalPrice = this.totalPrice + (item3.getPrice() * item3.getQuantity());
        }
        return this.totalPrice;
    }

    public void applyCard(double card) {
        this.card = 10.0;
        if (totalPrice > 50) {
            discount = (totalPrice * card / 100);
            payablePrice = totalPrice + discount;

        } else if (totalPrice <= 50) {
            payablePrice = totalPrice;
        }
    }

    public double getPayablePrice() {
        this.payablePrice = this.totalPrice - this.discount;
        return this.payablePrice;
    }

    public void printInvoice() {
        ListIterator<Item> iterator3 = item.listIterator();
        while (iterator3.hasNext()) {
            Item item4 = iterator3.next();
            System.out.print(item4.getProductName() + "\t");
            System.out.print(item4.getQuantity() + "\t");
            System.out.print(item4.getPrice() + "\t");
            System.out.println(item4.getPrice() * item4.getQuantity());
        }
        System.out.println("\t\t\t" + "Price    : " + this.getTotalPrice());
        this.applyCard(this.card);
        System.out.println("\t\t\t" + "Discount : " + this.discount);
        this.getPayablePrice();
        System.out.println("\t\t\t" + "Total    : " + this.getPayablePrice());
    }
}
