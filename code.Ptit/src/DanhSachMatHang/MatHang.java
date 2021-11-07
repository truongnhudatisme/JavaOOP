package DanhSachMatHang;

public class MatHang implements Comparable<MatHang> {
    private String mahang, tenhang, donvi;
    private long giamua,giaban,loinhuan;

    public MatHang(int stt, String tenhang, String donvi, String giamua,String giaban){
        this.mahang = "MH" + String.format("%03d",stt);
        this.tenhang = tenhang;
        this.donvi = donvi;
        this.giamua = Long.parseLong(giamua);
        this.giaban = Long.parseLong(giaban);
        this.loinhuan = this.giaban - this.giamua;
    }
    @Override
    public String toString(){
        return mahang + " " + tenhang + " " + donvi + " " + giamua + " " + giaban + " " + loinhuan;
    }
    @Override
    public int compareTo(MatHang o) {
        if(this.loinhuan < o.loinhuan)
            return 1;
        else if(this.loinhuan > o.loinhuan)
            return -1;
        else 
            return 0;
    }
}
