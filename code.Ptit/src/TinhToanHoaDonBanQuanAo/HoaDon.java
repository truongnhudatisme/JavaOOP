package TinhToanHoaDonBanQuanAo;

import java.util.ArrayList;

public class HoaDon implements Comparable<HoaDon> {
    private String mahoadon;
    private int soluong;
    private ArrayList<MatHang> dsMathang = new ArrayList<>();
    private String mahoadonout;
    private int stt;
    private long giamgia, tongtien;
    private String ten;
    public HoaDon(int stt, String mahoadon, String soluong, ArrayList<MatHang> dsMathang) {
        this.mahoadon = mahoadon;
        this.stt = stt;
        this.soluong = Integer.parseInt(soluong);
        this.dsMathang = dsMathang;
        xuly();
    }
    private void xuly(){
        String mahd = mahoadon.substring(0,2);
        char loaisp = mahoadon.charAt(2);
        for(MatHang mh: dsMathang){
            if(mh.getMaloai().equals(mahd)){
                ten = mh.getTensp();
                mahoadonout = mahoadon + "-" + String.format("%03d",stt);
                if(loaisp == '1'){
                    long dongialoai1 = mh.getDongia1();
                    tongtien = (long) dongialoai1*soluong;
                    if(soluong >= 150){
                        giamgia = (long) Math.ceil(tongtien*5/10.0);
                        tongtien = tongtien - giamgia;
                    }
                    else if(soluong >= 100){
                        giamgia = (long) Math.ceil(tongtien*3/10.0);
                        tongtien = tongtien - giamgia;
                    }
                    else if(soluong >= 50){
                        giamgia = (long) Math.ceil(tongtien*15/100.0);
                        tongtien = tongtien - giamgia;
                    }
                    else{
                        giamgia = 0;
                    }
                }
                else{
                    long dongialoai2 = mh.getDongia2();
                    tongtien = (long) dongialoai2*soluong;
                    if(soluong >= 150){
                        giamgia = (long) Math.ceil(tongtien*5/10.0);
                        tongtien = tongtien - giamgia;
                    }
                    else if(soluong >= 100){
                        giamgia = (long) Math.ceil(tongtien*3/10.0);
                        tongtien = tongtien - giamgia;
                    }
                    else if(soluong >= 50){
                        giamgia = (long) Math.ceil(tongtien*15/100.0);
                        tongtien = tongtien - giamgia;
                    }
                    else{
                        giamgia = 0;
                    }
                }
            }
        }
    }
    @Override
    public String toString(){
        return mahoadonout + " " + ten + " " + giamgia + " " + tongtien;
    }
    @Override
    public int compareTo(HoaDon o) {
        if(this.tongtien < o.tongtien)
            return 1;
        else if(this.tongtien > o.tongtien)
            return -1;
        else 
            return 0;
    }
}
