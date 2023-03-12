public class SaleDriver {
    public static void main(String[] args) {
        SaleableItem m = new Magazine();
        SaleableItem t = new Ticket();

        m.sellCopy();
        t.sellCopy();
    }
}
