package DanhSachSinhVienTrongFile;

import java.io.Serializable;

public class SinhVien implements Serializable {
	private String masv, hoten,ngaysinh,lop;
	private float diemgpa;
	public SinhVien(int stt, String hoten, String lop, String ngaysinh, String diemgpa) {
		this.masv = "B20DCCN" + String.format("%03d",stt);
		this.hoten = hoten;
		this.lop = lop;
		this.ngaysinh = chuanhoa(ngaysinh);;
		this.diemgpa = Float.parseFloat(diemgpa);
	}
	private String chuanhoa(String ngaysinh){
		String[] tmp = ngaysinh.split("/");
		if(tmp[0].length() == 1)
			tmp[0] = '0' + tmp[0];
		if(tmp[1].length() == 1)
			tmp[1] = '0' + tmp[1];
		return tmp[0] + '/' + tmp[1] + '/' + tmp[2];
	}
	@Override
	public String toString(){
		return masv + " " + hoten + " " + lop + " " + ngaysinh + " " + String.format("%.2f",diemgpa);
	}
}
