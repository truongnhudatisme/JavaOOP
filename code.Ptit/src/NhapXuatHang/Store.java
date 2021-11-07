package NhapXuatHang;

public class Store {
    private Items item;
    private int quantityIN,buy,quantityOUT;
    public Store(Items item, String quantityIN, String buy, String quantityOUT ){
        this.item = item;
        this.quantityIN = Integer.parseInt(quantityIN);
        this.buy = Integer.parseInt(buy);
        this.quantityOUT = Integer.parseInt(quantityOUT);
    }
    private int cal_sumIn(){
        return (int) quantityIN*buy;
    }
    
    private int cal_sumOut(){
        if(item.getItem_type().equals("A")){
            return (int) quantityOUT*buy*108/100;
        }
        else if(item.getItem_type().equals("B")){
            return (int) quantityOUT*buy*105/100;
        }
        else{
            return (int) quantityOUT*buy*102/100;
        }
    }

    @Override
    public String toString(){
        return item + " " + cal_sumIn() + " " + cal_sumOut();
    }
}
