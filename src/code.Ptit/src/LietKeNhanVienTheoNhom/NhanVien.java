package LietKeNhanVienTheoNhom;

public class NhanVien implements Comparable<NhanVien> {
    private String ten, chucvu, sohieu, bacluong;
    private String ma;
    public NhanVien(String ma, String ten){
        this.ma = ma;
        this.ten = ten;
        xuly();
    }

    private void xuly(){
        chucvu = ma.substring(0,2);
        bacluong = ma.substring(2,4);
        sohieu = ma.substring(4);
    }
    public String getSohieu(){
        return sohieu;
    }
    public String getTen(){
        return ten;
    }
    public void setChucvu(String chucvu){
        this.chucvu = chucvu;
    }
    public String getChucvu(){
        return chucvu;
    }
    public void setBacluong(String bacluong){
        this.bacluong = bacluong;
    }
    public String getBacluong(){
        return bacluong;
    }
    @Override 
    public String toString(){
        return ten + " " + chucvu + " " + sohieu + " " + bacluong;
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.bacluong.compareTo(o.bacluong) < 0)
            return 1;
        else if (this.bacluong.compareTo(o.bacluong) > 0)
            return -1;
        else{
            if(this.sohieu.compareTo(o.sohieu) < 0)
                return -1;
            else
                return 1;
        }
    }
}
