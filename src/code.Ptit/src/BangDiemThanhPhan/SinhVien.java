package BangDiemThanhPhan;

import java.util.Arrays;

public class SinhVien implements Comparable<SinhVien> {
	private String masv, hoten,lop;
	private double[] arrDiem = new double[3];
	public SinhVien(String masv, String hoten, String lop, double[] arrDiem) {
		super();
		this.hoten = hoten;
		this.lop = lop;
		this.arrDiem = arrDiem;
		this.masv = masv;
	}
	
	
	public String getHoten() {
		return hoten;
	}

	public String getMasv() {
		return masv;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %.1f %.1f %.1f",masv,hoten,lop,arrDiem[0],arrDiem[1],arrDiem[2]);
	}
	@Override
	public int compareTo(SinhVien o) {
//		if(this.getMasv().compareTo(o.getMasv()) > 0)
//			return 1;
//		return -1;
		if(this.getHoten().compareTo(o.getHoten()) > 0)
			return 1;
		else
			return -1;
	}
	

	
}
