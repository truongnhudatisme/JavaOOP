package TinhGioChoGiangVien;

import java.util.ArrayList;

public class TinhGio {
    private String magv, mahocphan;
    private String tengv, tenhp;
    private double gioday;
    private ArrayList<HocPhan> dshp;
    private ArrayList<GiangVien> dsgv;
    public TinhGio(String magv, String mahocphan, String gioday,ArrayList<HocPhan> dshp,ArrayList<GiangVien> dsgv) {
        this.magv = magv;
        this.mahocphan = mahocphan;
        this.gioday = Double.parseDouble(gioday);
        this.dsgv = dsgv;
        this.dshp = dshp;
    }
    private void xuly(){
        for(int i = 0; i < dsgv.size(); i++){
            if(magv.equals(dsgv.get(i).getMagv())){
                tengv = dsgv.get(i).getTengv();
                for(int j = 0; j < dshp.size(); j++){
                    if(mahocphan.equals(dshp.get(j).getMahocphan())){
                        tenhp = dshp.get(j).getTenhocphan();
                    }
                }
            }
        }
    }
    @Override
    public String toString(){
        return String.format("Giang vien: %s \n%s %.2f\n", tengv, tenhp, gioday);
    }
}
