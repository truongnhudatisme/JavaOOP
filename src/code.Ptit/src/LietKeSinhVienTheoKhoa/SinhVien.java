package LietKeSinhVienTheoKhoa;

public class SinhVien {
	private String masv,hoten,lop,email;
	private String khoahoc;
	public SinhVien(String masv, String hoten, String lop, String email) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.lop = lop;
		this.email = email;
		this.khoahoc = "20"+lop.charAt(1)+lop.charAt(2);
	}
	
	public String getKhoahoc() {
		return khoahoc;
	}
	public String getLop() {
		return lop;
	}
	@Override
	public String toString() {
		return masv + " " + hoten + " " + lop + " " + email;
	}
	
}