package HoaDon2;

public class Bill {
    private String bill_code;
    private Guest guest;
    private Product product;
    private int quantity;
    private static int serial = 1;
    public Bill(Guest guest, Product product, String quantity) {
        this.bill_code = "HD" + String.format("%03d",Bill.serial++);
        this.guest = guest;
        this.product = product;
        this.quantity = Integer.parseInt(quantity);
    }
    
    private long getTotal(){
        return product.getSell_price()*quantity;
    }

    @Override
    public String toString() {
        return bill_code + " " + guest + " " + product + " " + quantity + " " + getTotal();
    }

    
}
