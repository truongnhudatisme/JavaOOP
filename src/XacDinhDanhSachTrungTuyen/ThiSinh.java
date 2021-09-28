package XacDinhDanhSachTrungTuyen;

public class ThiSinh {
    private String mats, hotents;
    private double diemtoan, diemly, diemhoa;
    private double diemuutien, diemtb;
    private String trangthai;
    public ThiSinh(String mats, String hotents, String diemtoan, String diemly, String diemhoa){
        this.mats = mats;
        this.hotents = hotents;
        this.diemtoan = chuanhoadiem(diemtoan);
        this.diemhoa  = chuanhoadiem(diemhoa);
        this.diemly = chuanhoadiem(diemly);
    }

    private double chuanhoadiem(String diem){
        String s = "";
        if(diem.length() == 2 && Double.parseDouble(diem) != 10.0){
            s += diem.charAt(0);
            s += ".";
            s += diem.charAt(1);
        }
        else
            s = diem;
        return Double.parseDouble(s);
    }

    private String xulidiem(double tongdiem){
        int x = (int) tongdiem;
        if(x-tongdiem ==0)
            return String.valueOf(x);
        else
            return String.format("%.1f", tongdiem);
    }
    @Override
    public String toString(){
        return mats + " " + hotents + " ";
    }
}
