package TinhToanHoaDonBanQuanAo;

public class MatHang {
    private String maloai, tensp;
    private long dongia1, dongia2;
    public MatHang(String maloai, String tensp, String dongia1, String dongia2) {
        this.maloai = maloai;
        this.tensp = tensp;
        this.dongia1 = Long.parseLong(dongia1);
        this.dongia2 = Long.parseLong(dongia2);
    }
    public String getTensp(){
        return tensp;
    }
    public String getMaloai(){
        return maloai;
    }
    public long getDongia1(){
        return dongia1;
    }
    public long getDongia2(){
        return dongia2;
    }
    @Override
    public String toString(){
        return tensp;
    }
}
