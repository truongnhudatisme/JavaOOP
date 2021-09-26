package TongDaThuc1;

public class HangTu implements Comparable<HangTu> {
    private int heso;
    private String bac;

    public HangTu(int heso, String bac) {
        this.heso = heso;
        this.bac = bac;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public String getBac() {
        return bac;
    }

    
    @Override
    public String toString(){
        return String.format("%d*%s",heso,bac);
    }

    @Override
    public int compareTo(HangTu o) {
        if(this.bac.compareTo(o.bac) < 0)
            return 1;
        else if(this.bac.compareTo(o.bac) > 0)
            return -1;
        else
            return 0;
    }
}
