package HoaDon1;

public class Receipt {
    private Product product;
    private String id, id_receipt;
    private long quantity,discount, total;
    private static int serial = 1;
    public Receipt(Product product, String id, String quantity) {
        this.product = product;
        this.id = id;
        this.quantity = Long.parseLong(quantity);
        this.id_receipt = String.format("%s-%03d",id,Receipt.serial++);
        solve();
    }
    private void solve(){
        if(id.charAt(2) == '1'){
            total = (long) product.getType1Price()*quantity;
        }
        else{
            total =(long) product.getType2Price()*quantity;
        }
        if(quantity >= 150){
            discount = (long) Math.ceil(total*50/100.0);
            total -= discount;
        }
        else if(quantity >= 100){
            discount = (long) Math.ceil(total*30/100.0);
            total -= discount;
        }
        else if(quantity >= 50){
            discount = (long) Math.ceil(total*15/100.0);
            total -= discount;
        }
        else{
            discount = 0;
        }
    }
    @Override
    public String toString() {
        return id_receipt + " " + product.getName() + " " + discount + " " + total;
    }
    
}
