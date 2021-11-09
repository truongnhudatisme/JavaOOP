package ChuanHoaDanhSachSV;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String masv, hoten, lop;
    private Date ns;
    private float gpa;
    public SinhVien(int stt, String hoten, String lop, String ns, String gpa) throws ParseException{
        this.masv = "B20DCCN" + String.format("%03d",stt);
        this.hoten = convertTen(hoten);
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = Float.parseFloat(gpa);
    }
    private String convertTen(String hoten){
        StringTokenizer s = new StringTokenizer(hoten);
        StringBuilder res = new StringBuilder();
        while(s.hasMoreTokens()){
            String tmp = s.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++){
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    @Override
    public String toString() {
        return masv + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f",gpa);
    }
    
}
