package ThuNhapNhanVien;

public class NhanVien implements Comparable<NhanVien> {
	private String hoten;
	private String chucvu;
	private int luongcb;
	private int songay;
	private int stt;
	private String manv;
	public NhanVien(int stt,String hoten, String chucvu, int luongcb, int songay) {
		super();
		this.hoten = hoten;
		this.chucvu = chucvu;
		this.luongcb = luongcb;
		this.songay = songay;
		this.manv = "NV" + String.format("%02d",stt);
		this.stt = stt;
	}

	private int phuCap() {
		if(chucvu.equals("GD"))
			return 500;
		else if(chucvu.equals("PGD"))
			return 400;
		else if(chucvu.equals("TP"))
			return 300;
		else if(chucvu.equals("KT"))
			return 250;
		else
			return 100;
	}
	
	private int luongChinh() {
		return luongcb*songay;
	}
	
	private int tamUng() {
		double tu = (phuCap()+luongChinh())*2/3.0;
		if(tu < 25000) {
			return (int) Math.round(tu/1000.0)*1000;
		}
		else
			return 25000;
	}
	
	private int conLai() {
		return luongChinh() - tamUng() + phuCap();
	}
	
	private int thuNhap() {
		return luongChinh() + phuCap();
	}
	@Override
	public String toString() {
		return manv + " " + hoten + " " + phuCap() + " " + luongChinh() + " " + tamUng() + " " + conLai();
	}

	@Override
	public int compareTo(NhanVien o) {
		if(this.thuNhap() < o.thuNhap())
			return 1;
		else if(this.thuNhap() == o.thuNhap()) {
			if(this.stt > o.stt)
				return 1;
			else
				return -1;
		}
		else
			return -1;
	}	
}
