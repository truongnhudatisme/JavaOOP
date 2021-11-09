package HoaDon2;

public class Product {
    private String product_code, product_name, product_unit;
    private long buy_price, sell_price;
    private static int serial = 1;
    public Product( String product_name, String product_unit, String buy_price, String sell_price) {
        this.product_code = "MH" + String.format("%03d",Product.serial++);
        this.product_name = product_name;
        this.product_unit = product_unit;
        this.buy_price = Long.parseLong(buy_price);
        this.sell_price = Long.parseLong(sell_price);
    }
    

    public String getProduct_code() {
        return product_code;
    }

    public long getBuy_price() {
        return buy_price;
    }

    public long getSell_price() {
        return sell_price;
    }

    @Override
    public String toString() {
        return product_name + " " + product_unit + " " + buy_price + " " + sell_price;
    } 
    
}
