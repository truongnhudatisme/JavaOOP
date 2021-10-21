package TuyenDung;

public class NhanVien implements Comparable<NhanVien> {
	private String hoten, manv;
	private double diemlt,diemth;
	private double trungbinh;
	private String xeploai;
	public NhanVien(int i,String hoten, String diemlt, String diemth) {
		super();
		this.hoten = hoten;
		this.manv  = "TS" + String.format("%02d",i);
		this.diemlt = Double.parseDouble(format(diemlt));
		this.diemth = Double.parseDouble(format(diemth));
		solved();
	}
	private String format(String diem) {
		String s = "";
		if(diem.length() == 2 && !(diem.equals("10"))) {
			s += diem.charAt(0);
			s += ".";
			s += diem.charAt(1);
//			System.out.println(s);
			return s;
		}
		else
			return diem;
	}
	private void solved() {
		trungbinh = (diemlt+diemth)/2;
		trungbinh = Math.round(trungbinh*100)/100.0;
		if(trungbinh < 5.00)
			xeploai = "TRUOT";
		else if(5.00 <= trungbinh && trungbinh < 8.00)
			xeploai = "CAN NHAC";
		else if(8.00 <= trungbinh && trungbinh < 9.50)
			xeploai = "DAT";
		else
			xeploai = "XUAT SAC";
	}
	@Override
	public String toString() {
		return manv + " " + hoten + " " + String.format("%.2f",trungbinh) + " " + xeploai;
	}
	@Override
	public int compareTo(NhanVien o) {
		if(this.trungbinh < o.trungbinh)
			return 1;
		return -1;
	}
	
}	
