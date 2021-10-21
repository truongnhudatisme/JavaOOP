package ClubBongDa;

public class BongDa {
    private String maclb, tenclb;
    private int giave;
    private String matrandau;
    private long soluong;
    public BongDa(String maclb, String tenclb, String giave){
        this.maclb = maclb;
        this.tenclb = tenclb;
        this.giave = Integer.parseInt(giave);
    }
    public void setMatrandau(String matrandau){
        this.matrandau = matrandau;
    }
    public void setSoluong(String soluong){
        this.soluong = Long.parseLong(soluong);
    }
    private long doanhthu(){
        return (long) soluong*giave;
    }
    @Override
    public String toString(){
        return matrandau + " " + tenclb + " " + doanhthu();
    }
}
