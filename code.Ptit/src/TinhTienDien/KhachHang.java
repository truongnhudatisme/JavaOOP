package TinhTienDien;

public class KhachHang implements Comparable<KhachHang> {
	private int stt;
	private String loaisd, makh;
	private int csc, csm;
	
	public KhachHang(int stt, String loaisd, int csc, int csm) {
		super();
		this.stt = stt;
		this.makh = "KH" + String.format("%02d",stt);
		this.loaisd = loaisd;
		this.csc = csc;
		this.csm = csm;
	}
	
	private int heSo() {
		if(loaisd.equals("KD"))
			return 3;
		else if(loaisd.equals("NN"))
			return 5;
		else if(loaisd.equals("TT"))
			return 4;
		else if(loaisd.equals("CN"))
			return 2;
		else
			return 0;
	}
	
	private int thanhTien() {
		return (csm-csc)*heSo()*550;
	}
	
	private int phuTroi() {
		int a = csm - csc;
		int tien = thanhTien();
		if(a < 50)
			return 0;
		else if(50 <= a && a <= 100)
			return (int) Math.round(tien*35/100.0);
		else
			return tien;
	}
	
	private int tongTien() {
		return phuTroi() + thanhTien();
	}

	@Override
	public String toString() {
		return makh + " " + heSo() + " " + thanhTien() +  " " + phuTroi() + " " + tongTien();
	}
	
	@Override
	public int compareTo(KhachHang o) {
		if(this.tongTien() < o.tongTien())
			return 1;
		else 
			return -1;
	}	
	
	
}
