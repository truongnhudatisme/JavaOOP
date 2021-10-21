package DiemDanh;

public class SinhVien {
    private String masv, hoten,lop;
    private int stt;
    public SinhVien(int stt,String masv, String hoten, String lop){
        this.stt = stt;
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
    }
    public String getMasv(){
        return masv;
    }
    public String getHoten(){
        return hoten;
    }
    public String getLop(){
        return lop;
    }
    public int getStt(){
        return stt;
    }
    @Override
    public String toString(){
        return masv + " " + hoten + " " + lop;
    }
}
