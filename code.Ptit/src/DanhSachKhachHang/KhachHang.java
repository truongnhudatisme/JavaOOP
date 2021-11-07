
package DanhSachKhachHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang> {
    private String makh, hoten, gioitinh, diachi;
    private Date ngaysinh;
    public KhachHang(int stt,String hoten, String gioitinh, String ngaysinh, String diachi) throws ParseException {
        this.makh = "KH" + String.format("%03d",stt);
        this.hoten = parseName(hoten);
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
    }
    
    private String parseName(String hoten){
        StringTokenizer s = new StringTokenizer(hoten);
        StringBuilder result = new StringBuilder();
        while(s.hasMoreTokens()){
            String tmp = s.nextToken();
            result.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++){
                result.append(Character.toLowerCase(tmp.charAt(i)));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.ngaysinh.compareTo(o.ngaysinh) < 0)
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return makh + " " + hoten + " " + gioitinh + " " + diachi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh);
    }
    
}
