package TinhGiaBan;

public class MatHang implements Comparable<MatHang> {
	private String tenhang, mahang;
	private int stt;
	private String donvi;
	private int dongia;
	private int soluong;
	private double phivc, thanhtien, giaban, giabanle;
	public MatHang(int stt,String tenhang, String donvi, int dongia, int soluong) {
		super();
		this.mahang = "MH" + String.format("%02d",stt);
		this.tenhang = tenhang;
		this.stt = stt;
		this.donvi = donvi;
		this.dongia = dongia;
		this.soluong = soluong;
		phiVanChuyen(dongia, soluong);
		thanhTien();
		giaBan();
	}
	
	private void phiVanChuyen(int dongia, int soluong) {
		phivc = Math.round(dongia*soluong*5/100.0);
	}
	
	private void thanhTien() {
		thanhtien = Math.round(dongia*soluong + phivc);
	}
	
	private void giaBan() {
		giaban = (thanhtien + thanhtien*2/100)/soluong;
		giabanle =(int) Math.ceil(giaban/100.0)*100;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %.0f %.0f %.0f",mahang, tenhang,donvi, phivc, thanhtien, giabanle);
//		return mahang + " " + tenhang + " " + donvi + " " + phivc + " " + thanhtien + " " + giaban;
	}

	@Override
	public int compareTo(MatHang o) {
		if(this.giabanle < o.giabanle)
			return 1;
		else
			return -1;
	}
	
}
