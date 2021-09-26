package TongDaThuc2;

public class HangTu implements Comparable<HangTu> {
    private int heso,bac;
    public HangTu(int heso, int bac){
        this.heso = heso;
        this.bac = bac;
    }
    public int getHeso() {
        return heso;
    }
    public void setHeso(int heso) {
        this.heso = heso;
    }
    public int getBac() {
        return bac;
    }
    @Override
    public String toString(){
        return heso +"*x^" + bac;
    }
	@Override
	public int compareTo(HangTu o) {
		if(this.bac < o.bac)
            return 1;
        else if(this.bac == o.bac)
		    return 0;
        else
            return -1;
	}
}
