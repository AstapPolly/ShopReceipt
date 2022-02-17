import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner("\n\tWelcome to our shop!" +
                "\n\tNew shop on Brown Street'" +
                "" +
                "\n\tCashier: Bob Smith'" +
                "\n\tData: 16.02.2022" +
                "\n\tTime: 18:25" +
                "'" +
                "'");
        scan.useDelimiter("'");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();

        Item i1 = new Item("Pajamas", 1, 10.02);
        Item i2 = new Item("Socks", 6, 1.47);
        Item i3 = new Item("Tights", 3, 3.89);
        Item i4 = new Item("Nighty", 1, 8.66);
        Item i5 = new Item("Shorts", 2, 7.18);

        Receipt receipt = new Receipt();

        receipt.addToReceipt(i1);
        receipt.addToReceipt(i2);
        receipt.addToReceipt(i3);
        receipt.addToReceipt(i4);
        receipt.addToReceipt(i5);

        receipt.applyCard(10.0);

        receipt.printInvoice();
        System.out.println("\n\tThank you for Shopping\n\t");
    }
}
