package DanhSachDoanhNghiep;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
	private String madn, tendn;
	private int soluong;
	public DoanhNghiep(String madn, String tendn, int soluong) {
		super();
		this.madn = madn;
		this.tendn = tendn;
		this.soluong = soluong;
	}
	public int getSoluong() {
		return soluong;
	}
	
	public String getMadn() {
		return madn;
	}
	@Override
	public String toString() {
		return madn + " " + tendn + " " + soluong;
	}
	@Override
	public int compareTo(DoanhNghiep o) {
		if(this.getSoluong() < o.getSoluong())
			return 1;
		else if(this.getSoluong() == o.getSoluong()) {
			if(this.getMadn().compareTo(o.madn)  > 0)
				return 1;
			else
				return -1;
		}
		return -1;
	}
	
}
