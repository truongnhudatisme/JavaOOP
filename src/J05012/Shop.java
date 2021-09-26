package J05012;

public class Shop implements Comparable<Shop> {
    private String mahang, mathang;
    private int soluong;
    private long dongia, tienchietkhau;
    private long tongtien;
    public Shop(String mahang, String mathang, int soluong, long dongia, long tienchietkhau) {
        this.mahang = mahang;
        this.mathang = mathang;
        this.soluong = soluong;
        this.dongia = dongia;
        this.tienchietkhau = tienchietkhau;
        tinhtien();
    }

    private void tinhtien(){
        tongtien = dongia * soluong - tienchietkhau;
    }

    @Override
    public String toString() {
        return mahang + " " + mathang + " " + soluong + " " + dongia + " " + tienchietkhau + " " + tongtien;
    }

    @Override
    public int compareTo(Shop o) {
        if(this.tongtien < o.tongtien)
            return 1;
        else if (this.tongtien == o.tongtien)
            return 0;
        else
            return -1;
    }

    

}
