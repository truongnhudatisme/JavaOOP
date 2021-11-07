package BangTinhGioChuan;

public class GiangVien {
    private String magv, tengv;
    private float gioday;
    public GiangVien(String magv, String tengv) {
        this.magv = magv;
        this.tengv = tengv;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public float getGioday() {
        return gioday;
    }

    public void setGioday(float gioday) {
        this.gioday = gioday;
    }

    @Override
    public String toString() {
        return  tengv + " " + String.format("%.2f",gioday);
    }
    
}
