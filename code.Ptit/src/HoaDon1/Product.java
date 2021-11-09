package HoaDon1;

public class Product {
    private String id,name;
    private long type1Price, type2Price;
    public Product(String id, String name, String type1Price, String type2Price) {
        this.id = id;
        this.name = name;
        this.type1Price = Long.parseLong(type1Price);
        this.type2Price = Long.parseLong(type2Price);
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getType1Price() {
        return type1Price;
    }
    public long getType2Price() {
        return type2Price;
    }

    
}
