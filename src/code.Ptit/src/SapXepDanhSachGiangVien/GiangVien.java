package SapXepDanhSachGiangVien;

public class GiangVien implements Comparable<GiangVien> {
	private String hoten, bomon, magv;
	private String bomonVT = "", tenRieng;
	private int stt;
	public GiangVien(int stt,String hoten, String bomon) {
		super();
		this.hoten = hoten;
		this.bomon = bomon;
		this.magv = "GV"+ String.format("%02d",stt);
		this.stt = stt;
		chuyendoiBM(bomon);
		String[] ten = hoten.split("\\s+");
		this.tenRieng = ten[ten.length-1];
	}
	private void chuyendoiBM(String bomon) {
		String[] str = bomon.split("\\s+");
		for(int i = 0 ; i < str.length; i++) {
			bomonVT += Character.toUpperCase(str[i].charAt(0));
		}
	}
	
	public String getTenRieng() {
		return tenRieng;
	}
	public int getStt() {
		return stt;
	}
	@Override
	public String toString() {
		return magv + " " + hoten + " " + bomonVT;
	}
	@Override
	public int compareTo(GiangVien obj) {
		if(this.getTenRieng().compareTo(obj.getTenRieng()) > 0)
			return 1;
		else if(this.getTenRieng().compareTo(obj.getTenRieng()) == 0) {
			if(this.getStt() > obj.getStt()) 
				return 1;
			else
				return -1;
		}
		else
			return -1;
	}
	
}
