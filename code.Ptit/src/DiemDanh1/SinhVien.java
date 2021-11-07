package DiemDanh1;

public class SinhVien {
    private int stt;
    private String masv, hoten, lop;
    private int diemcc = 10;
    private String ghichu = "";
    public SinhVien(int stt,String masv, String hoten, String lop) {
        this.stt = stt;
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
    }
    

    public int getStt() {
        return stt;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getDiemcc() {
        return diemcc;
    }

    public void setDiemcc(int diemcc) {
        this.diemcc = diemcc;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    @Override
    public String toString() {
        if(ghichu.equals("KDDK"))
            return masv + " " + hoten + " "  + lop + " " + diemcc + " " + ghichu;
        else
            return masv + " " + hoten + " "  + lop + " " + diemcc;
    }

    
}
