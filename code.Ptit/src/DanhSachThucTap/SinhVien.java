package DanhSachThucTap;

public class SinhVien implements Comparable<SinhVien> {
	private int stt;
	private String masv,hoten,lop,email,doanhnghiep;
	public SinhVien(int stt, String masv, String hoten, String lop, String email, String doanhnghiep) {
		super();
		this.stt = stt;
		this.masv = masv;
		this.hoten = hoten;
		this.lop = lop;
		this.email = email;
		this.doanhnghiep = doanhnghiep;
	}
	
	public String getHoten() {
		return hoten;
	}
	
	public String getDoanhnghiep() {
		return doanhnghiep;
	}
	
	
	public String getMasv() {
		return masv;
	}

	@Override
	public int compareTo(SinhVien o) {
		if(this.getMasv().compareTo(o.getMasv()) < 0)
			return -1;
		return 1;
	}
	@Override
	public String toString() {
		return stt + " " + masv + " " + hoten + " " + lop + " " + email + " " + doanhnghiep;
	}
	
}
