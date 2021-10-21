package BangKeTienLuong;

public class NhanVien {
	private String hoten, manv;
	private int luongngay;
	private int songay;
	private String chucvu;
	private int tienthuong;
	private int phucap,thuclinh;
	public NhanVien(int stt,String hoten, int luongngay, int songay, String chucvu) {
		super();
		this.hoten = hoten;
		this.manv = "NV" + String.format("%02d",stt);
		this.luongngay = luongngay;
		this.songay = songay;
		this.chucvu = chucvu;
		tienThuong();
		phuCapCV();
		thucLinh();
	}
	
	private int luongThang() {
		return luongngay*songay;
	}
	
	private void tienThuong() {
		if(songay < 22)
			tienthuong = 0;
		else if(22 <= songay && songay < 25)
			tienthuong = (int) Math.round(luongThang()/10.0);
		else
			tienthuong = (int) Math.round(luongThang()*2/10.0);
	}
	
	private void phuCapCV() {
		if(chucvu.equals("GD"))
			phucap = 250000;
		else if(chucvu.equals("PGD"))
			phucap = 200000;
		else if(chucvu.equals("TP"))
			phucap = 180000;
		else 
			phucap = 150000;
	}
	private void thucLinh() {
		thuclinh =  luongThang() + tienthuong + phucap;
	}
	
	
	public int getThuclinh() {
		return thuclinh;
	}

	@Override
	public String toString() {
		return manv + " " + hoten + " " + luongThang() + " " + tienthuong + " " + phucap + " " + thuclinh;
	}
	
}
