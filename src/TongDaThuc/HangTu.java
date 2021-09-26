package TongDaThuc;

public class HangTu implements Comparable<HangTu> {
    private String bac;
    private int heso;

    public HangTu(int heso, String bac){
        this.heso = heso;
        this.bac = bac;
    }

    @Override 
    public String toString(){
        return heso + "*" + bac;
    }

    @Override
    public int compareTo(HangTu o) {
        if(this.bac.compareTo(o.bac) < 0)
            return 1;
        else
            return -1;
    }
}
