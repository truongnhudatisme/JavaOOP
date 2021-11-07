package TinhGioChuanChoTungGiangVien;

import java.util.ArrayList;

public class LopHocPhan {
    private String magv, monhoc;
    private float gioday;
    public LopHocPhan(String magv, String monhoc, String gioday) {
        this.magv = magv;
        this.monhoc = monhoc;
        this.gioday = Float.parseFloat(gioday);
    }
    public String getMagv() {
        return magv;
    }
    public void setMagv(String magv) {
        this.magv = magv;
    }
    public String getMonhoc() {
        return monhoc;
    }
    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }
    public float getGioday() {
        return gioday;
    }
    public void setGioday(float gioday) {
        this.gioday = gioday;
    }
    
}
