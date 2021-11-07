package TraCuuDonHang;

public class MatHang implements Comparable<MatHang> {
	private String tenhang;
	private String madonhang;
	private int dongia;
	private int soluong;
	private String sttdonhang;
	private int giamgia,thanhtien;
	public MatHang(String tenhang, String madonhang, int dongia, int soluong) {
		super();
		this.tenhang = tenhang;
		this.madonhang = madonhang;
		this.dongia = dongia;
		this.soluong = soluong;
		this.sttdonhang = madonhang.substring(1,4);
		thanhTien();
	}
	
	private void thanhTien() {
		int tien = dongia*soluong;
		if(madonhang.charAt(4) == '2')
			giamgia = (int) Math.round(tien*3/10.0);
		else
			giamgia =  (int) Math.round(tien*5/10.0);
		thanhtien = soluong*dongia - giamgia;
	}
	

	@Override
	public String toString() {
		return tenhang + " " + madonhang + " " + sttdonhang + " " + giamgia + " " + thanhtien;
	}

	@Override
	public int compareTo(MatHang o) {
		if(this.sttdonhang.compareTo(o.sttdonhang) < 0)
			return -1;
		return 1;
	}
	
}
