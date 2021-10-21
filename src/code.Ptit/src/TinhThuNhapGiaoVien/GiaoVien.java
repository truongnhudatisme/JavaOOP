package TinhThuNhapGiaoVien;

public class GiaoVien {
    private String mangang, hoten;
    private int luongcb;
    private int bacluong, phucap, thunhap;
    public GiaoVien(String mangang, String hoten, String luongcb){
        this.mangang = mangang;
        this.hoten = hoten;
        this.luongcb = Integer.parseInt(luongcb);
        xuly();
    }

    public String getMangang(){
        return mangang;
    }
    private void xuly(){
        bacluong = Integer.parseInt(mangang.substring(2,4));
        String ma = mangang.substring(0, 2);
        if(ma.equals("HT")) phucap = 2000000;
        else if(ma.equals("HP")) phucap = 900000;
        else phucap = 500000;
        thunhap = luongcb*bacluong + phucap;
    }

    @Override
    public String toString(){
        return mangang + " " + hoten + " " + bacluong + " " + phucap + " " + thunhap;
    }
}