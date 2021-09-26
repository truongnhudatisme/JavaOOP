package TuyenGiaoVien;

public class GiaoVien implements Comparable<GiaoVien> {
    private String tengv,magv;
    private double diemtinhoc;
    private double diemchuyenmon;
    private double diemuutien;
    private String monxet;
    private double tongDiem;
    private String kq;

    public GiaoVien(int stt,String tengv, String maxet, double diemtinhoc, double diemchuyenmon) {
        this.tengv = tengv;
        this.magv = "GV" + String.format("%02d",stt);
        this.diemtinhoc = diemtinhoc;
        this.diemchuyenmon = diemchuyenmon;
        findMonxet(maxet);
        findDiemUuTien(maxet);
        findTongDiem();
    }
    
    private void findMonxet(String maxet){
        if(maxet.charAt(0) == 'A')
            monxet = "TOAN";
        else if(maxet.charAt(0) == 'B')
            monxet = "LY";
        else
            monxet = "HOA";
    }

    private void findDiemUuTien(String maxet){
        if(maxet.charAt(1) == '1')
            diemuutien = 2.0;
        else if(maxet.charAt(1) == '2')
            diemuutien = 1.5;
        else if(maxet.charAt(1) == '3')
            diemuutien = 1.0;
        else
            diemuutien = 0.0;
    }

    private void findTongDiem(){
        tongDiem = diemtinhoc*2.0 + diemchuyenmon + diemuutien;
        tongDiem = Math.round(tongDiem*10.0)/10.0;
        if(tongDiem >= 18.0)
            kq = "TRUNG TUYEN";
        else
            kq = "LOAI";
    }

    @Override
    public String toString() {
        return magv + " " + tengv + " " + monxet + " " + tongDiem + " " + kq;
    }

    @Override
    public int compareTo(GiaoVien o) {
        if(this.tongDiem < o.tongDiem)
            return 1;
        else if(this.tongDiem == o.tongDiem)
            return 0;
        else
            return -1;
    }

}
