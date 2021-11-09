package TinhCuocDienThoaiCoDinh;

public class City {
    private String zipCode, name;
    private int fee;
    public City(String zipCode, String name, String fee) {
        this.zipCode = zipCode;
        this.name = name;
        this.fee = Integer.parseInt(fee);
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return name;
    }
    
}
