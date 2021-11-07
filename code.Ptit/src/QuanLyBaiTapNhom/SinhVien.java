package QuanLyBaiTapNhom;

public class SinhVien { 
	private String masv;
	private String hoten;
	private String sdt;
	private int stt;
	public SinhVien(String masv, String hoten, String sdt, int stt) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.sdt = sdt;
		this.stt = stt;
	}
	@Override
	public String toString() {
		return masv + " " + hoten + " " + sdt;
	}
}
