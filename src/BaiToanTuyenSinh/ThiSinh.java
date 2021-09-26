package BaiToanTuyenSinh;

public class ThiSinh {
    private String mats;
    private String hoten;
    private double diemtoan,diemly,diemhoa;
    private String khuvuc;
    private double tongdiem;
    private String trangthai;
    private double diemcong;
    public ThiSinh(String mats, String hoten, double diemtoan, double diemly, double diemhoa) {
        this.mats = mats;
        this.hoten = hoten;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
        this.khuvuc = mats.substring(0,3);
        tongDiem();
    }
    
    private void tongDiem(){
        if(khuvuc.equals("KV1"))
            diemcong =  0.5;
        else if(khuvuc.equals("KV2"))
            diemcong =  1.0;
        else 
            diemcong =  2.5;
        tongdiem = diemtoan*2 + diemly + diemhoa + diemcong;
        if(tongdiem <= 24)
            trangthai = "TRUOT";
        else
            trangthai = "TRUNG TUYEN";
        tongdiem = diemtoan*2 + diemly + diemhoa;
    }

    @Override
    public String toString() {
        return mats + " " + hoten + " " + String.format("%.1f ",diemcong) + tongdiem + " " + trangthai;
    }

    
}
