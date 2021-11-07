package DiemDanh;

import java.util.ArrayList;

public class Diemdanh implements Comparable<Diemdanh> {
    private String xaukytu, masvv, ten, lop;
    private int stt;
    private int diemcc = 10;
    private String trangthai = "";
    private ArrayList<SinhVien> dssv;
    public Diemdanh(String masvv,String xaukytu, ArrayList<SinhVien> dssv){
        this.xaukytu = xaukytu;
        this.masvv = masvv;
        this.dssv = dssv;
        xuly();
    }
    private void xuly(){
        for(int j = 0; j < dssv.size(); j++){
            String masv = dssv.get(j).getMasv();
            if(masv.equals(masvv)){
                ten = dssv.get(j).getHoten();
                stt = dssv.get(j).getStt();
                lop = dssv.get(j).getLop();
                for(int i = 0; i < xaukytu.length(); i++){
                    if(xaukytu.charAt(i) == 'x')
                        continue;
                    else if(xaukytu.charAt(i) == 'm'){
                        diemcc -= 1;
                    }
                    else{
                        diemcc -= 2;
                    }
                }
                if(diemcc <= 0){
                    trangthai = "KDDK";
                    diemcc  = 0;
                }
            }

        }
    }
    public String getLop(){
        return lop;
    }
    @Override
    public String toString(){
        return trangthai.equals("") ? masvv + " " + ten + " " + lop + " " + diemcc : masvv + " " + ten + " " + lop + " " + diemcc + " " + trangthai;
    }
    @Override
    public int compareTo(Diemdanh o) {
        if(this.stt < o.stt)
            return -1;
        else
            return 1;
    }
}
