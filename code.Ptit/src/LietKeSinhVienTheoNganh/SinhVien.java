package LietKeSinhVienTheoNganh;

public class SinhVien {
	private String masv,hoten,lop,email;
	public SinhVien(String masv, String hoten, String lop, String email) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.lop = lop;
		this.email = email;
	}

	public String getLop() {
		return lop;
	}

	public String getMasv() {
		return masv;
	}

	@Override
	public String toString() {
		return masv + " " + hoten + " " + lop + " " + email;
	}
	
}