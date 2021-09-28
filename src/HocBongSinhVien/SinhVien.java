package HocBongSinhVien;

public class SinhVien implements Comparable<SinhVien> {
    private int stt;
    private String tensv;
    private double diemtb;
    private int diemrl;
    private String xeploai;
    public SinhVien(int stt,String tensv, String diemtb, String diemrl) {
        this.stt = stt;
        this.tensv = tensv;
        this.diemtb = Double.parseDouble(diemtb);
        this.diemrl = Integer.parseInt(diemrl);
        xuly();
    }
    
    private void xuly(){
        if (diemtb >= 3.6 && diemrl >= 90)
            xeploai = "XUATSAC";
        else if(diemtb >= 3.2 && diemrl >= 80)
            xeploai = "GIOI";
        else if( diemtb >= 2.5 && diemrl >= 70)
            xeploai = "KHA";
        else
            xeploai = "KHONG";
    }

    public int getStt(){
        return stt;
    }

    public double getDiemtb(){
        return diemtb;
    }

    public void setXeploai(String xeploai){
        this.xeploai = xeploai;
    }
    public void xephangmoi(){
        if (diemtb >= 3.6 && diemrl >= 90)
            xeploai = "XUATSAC";
        else if(diemtb >= 3.2 && diemrl >= 80)
            xeploai = "GIOI";
        else if( diemtb >= 2.5 && diemrl >= 70)
            xeploai = "KHA";
        else
            xeploai = "KHONG";
    }
    @Override
    public String toString(){
        return tensv + ": " + xeploai; 
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.getDiemtb() < o.getDiemtb())
            return 1;
        else if(this.getDiemtb() == o.getDiemtb())
            return 0;
        else
            return -1;
    }
}
