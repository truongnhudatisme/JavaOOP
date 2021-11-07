package NhapXuatHang;

public class Items {
    private String item_id, item_name, item_type;

    public Items(String item_id, String item_name, String item_type) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_type = item_type;
    }

    public String getItem_id() {
        return item_id;
    }


    public String getItem_name() {
        return item_name;
    }


    public String getItem_type() {
        return item_type;
    }

    @Override
    public String toString() {
        return item_id + " " + item_name;
    }

    
}
