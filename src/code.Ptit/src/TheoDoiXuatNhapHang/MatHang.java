package TheoDoiXuatNhapHang;

public class MatHang implements Comparable<MatHang> {
	private String mahang;
	private int soluong;
	private int xuat;
	private int dongia;
	public MatHang(String mahang, int soluong) {
		super();
		this.mahang = mahang;
		this.soluong = soluong;
		this.xuat =slXuat(soluong);
		this.dongia = donGia(mahang);
	}
	
	
	public String getMahang() {
		return mahang;
	}

	private int slXuat(int soluong) {
		if(mahang.charAt(0)=='A')
			return (int) Math.round(6*soluong/10.0);
		else
			return (int) Math.round(7*soluong/10.0);
	}
	
	private int donGia(String mahang){
		if(mahang.charAt(4)=='Y')
			return 110000;
		else
			return 135000;
	}
	
	private int tongTien() {
		return xuat*dongia;
	}
	
	private int thue() {
		int tien = tongTien();
		if(mahang.charAt(0) == 'A' && mahang.charAt(4) == 'Y')
			return tien/100*8;
		else if(mahang.charAt(0) == 'A' && mahang.charAt(4) == 'N')
			return tien/100*11;
		else if(mahang.charAt(0) == 'B' && mahang.charAt(4) == 'Y')
			return tien/100*17;
		else
			return tien/100*22;
		
	}

	@Override
	public String toString() {
		return mahang + " " + soluong + " " + xuat + " " + dongia + " " + tongTien() + " " + thue();
	}


	@Override
	public int compareTo(MatHang o) {
		if(this.thue() < o.thue())
			return 1;
		else
			return -1;
	}
	
	
}
