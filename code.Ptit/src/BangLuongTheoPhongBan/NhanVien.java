package BangLuongTheoPhongBan;

import java.util.ArrayList;

public class NhanVien {
    private String manv, tennv, tenphong, maphong;
    private long  luongcb, songay;
    private ArrayList<PhongBan> dspb;
    private int heso;
    private long luongthang;
    public NhanVien(String manv, String tennv, String luongcb, String songay, ArrayList<PhongBan> dspb) {
        this.manv = manv;
        this.tennv = tennv;
        this.luongcb = Long.parseLong(luongcb);
        this.songay = Long.parseLong(songay);
        this.dspb = dspb;
        xuly();
    }
    private void xuly(){
        maphong = manv.substring(3);
        for(int i = 0; i < dspb.size(); i++){
            if(maphong.equals(dspb.get(i).getMap())){
                tenphong = dspb.get(i).getTenp();
            }
        }
        int sonamcongtac = Integer.parseInt(manv.substring(1,3));
        if(manv.charAt(0) == 'A'){
            if(sonamcongtac >= 1 && sonamcongtac <= 3)
                heso = 10;
            else if(sonamcongtac >= 4 && sonamcongtac <= 8)
                heso = 12;
            else if(sonamcongtac >= 9 && sonamcongtac <= 15)
                heso = 14;
            else
                heso = 16;
        }
        else if(manv.charAt(0) == 'B'){
            if(sonamcongtac >= 1 && sonamcongtac <= 3)
                heso = 10;
            else if(sonamcongtac >= 4 && sonamcongtac <= 8)
                heso = 11;
            else if(sonamcongtac >= 9 && sonamcongtac <= 15)
                heso = 13;
            else
                heso = 16;
        }
        else if(manv.charAt(0) == 'C'){
            if(sonamcongtac >= 1 && sonamcongtac <= 3)
                heso = 9;
            else if(sonamcongtac >= 4 && sonamcongtac <= 8)
                heso = 10;
            else if(sonamcongtac >= 9 && sonamcongtac <= 15)
                heso = 12;
            else
                heso = 14;
        }
        else{
            if(sonamcongtac >= 1 && sonamcongtac <= 3)
                heso = 8;
            else if(sonamcongtac >= 4 && sonamcongtac <= 8)
                heso = 9;
            else if(sonamcongtac >= 9 && sonamcongtac <= 15)
                heso = 11;
            else
                heso = 13;
        }
        luongthang = (long) songay*luongcb*heso;
    }
    public String getMaphong(){
        return maphong;
    }
    public String getTenphong(){
        return tenphong;
    }
    @Override
    public String toString(){
        return String.format("%s %s %d000",manv, tennv, luongthang);
    }
}
