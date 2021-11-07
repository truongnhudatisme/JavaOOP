package TinhToanGiaBan;

public class MatHang {
    private String mahang;
    private long dongia, soluong, tongtien;
    private double thue, phivanchuyen, loinhuan;
    public MatHang(String mahang, String dongia, String soluong){
        this.mahang = mahang;
        this.dongia = Long.parseLong(dongia);
        this.soluong = Long.parseLong(soluong);
        xuly();
    }
    private void xuly(){
        char ktd = mahang.charAt(0);
        tongtien = (long) soluong*dongia;
        if(ktd == 'T'){
            thue = Math.ceil(tongtien*29/100.0);
            phivanchuyen = Math.ceil(tongtien*4/100.0);
        }
        else if(ktd == 'C'){
            thue = Math.ceil(tongtien*10/100.0);
            phivanchuyen = Math.ceil(tongtien*3/100.0);
        }
        else if(ktd == 'D'){
            thue = Math.ceil(tongtien*8/100.0);
            phivanchuyen = Math.ceil(tongtien*2.5/100.0);
        }
        else{
            thue = Math.ceil(tongtien*2/100.0);
            phivanchuyen = Math.ceil(tongtien*0.5/100.0);
        }
        tongtien += phivanchuyen + thue;
        char ktc = mahang.charAt(mahang.length()-1);
        if(ktc == 'C'){
            thue = Math.ceil(thue*5/100.0);
            tongtien -= thue;
        }
        loinhuan = Math.ceil(tongtien*120/100.0)/soluong;
    }
    @Override
    public String toString(){
        return mahang + " " + String.format("%.2f",loinhuan);
    }
}
