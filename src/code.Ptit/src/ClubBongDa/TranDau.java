package ClubBongDa;

public class TranDau {
    private String maclb, tenclb;
    private int giave;
    public TranDau(String maclb, String tenclb, String giave) {
        this.maclb = maclb;
        this.tenclb = tenclb;
        this.giave = Integer.parseInt(giave);
    }
    public String getMaclb(){
        return maclb;
    }
    public String getTenclb(){
        return tenclb;
    }
    public int getGiave(){
        return giave;
    }
}
