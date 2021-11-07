package ClubBongDa;

import java.util.ArrayList;

public class DoanhThu implements Comparable<DoanhThu> {
    private String matrandau;
    private long soluong;
    private long doanhthu;
    private ArrayList<TranDau> ds;
    private String tentd;
    public DoanhThu(String matrandau, String soluong, ArrayList<TranDau> ds) {
        this.matrandau = matrandau;
        this.soluong = Long.parseLong(soluong);
        this.ds = ds;
        xuly();
    }
    private void xuly(){
        for(TranDau td:ds){
            if(td.getMaclb().equals(matrandau.substring(1,3))){
                tentd = td.getTenclb();
                doanhthu = (long) td.getGiave()*soluong;
            }
        }
    }
    @Override
    public String toString(){
        return matrandau + " " + tentd + " " + doanhthu;
    }
    @Override
    public int compareTo(DoanhThu o) {
        if(this.doanhthu < o.doanhthu)
            return 1;
        else if(this.doanhthu > o.doanhthu)
            return -1;
        else{
            if(this.tentd.compareTo(o.tentd) < 0)
                return -1;
            else return 1;
        }
    }

}
