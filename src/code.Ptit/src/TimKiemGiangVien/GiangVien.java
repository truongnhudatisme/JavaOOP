package TimKiemGiangVien;

public class GiangVien{
	private String hoten, magv;
	private String bomonVT = "", tenRieng;
	private int stt;
	public GiangVien(int stt,String hoten, String bomon) {
		super();
		this.hoten = hoten;
//		this.bomon = bomon;
		this.magv = "GV"+ String.format("%02d",stt);
		this.stt = stt;
		chuyendoiBM(bomon);
		String[] ten = hoten.split("\\s+");
		this.tenRieng = ten[ten.length-1];
	}
	
	public String getHoten() {
		return hoten;
	}

	public String getBomonVT() {
		return bomonVT;
	}

	private void chuyendoiBM(String bomon) {
		String[] str = bomon.split("\\s+");
		for(int i = 0 ; i < str.length; i++) {
			bomonVT += Character.toUpperCase(str[i].charAt(0));
		}
	}
	
	@Override
	public String toString() {
		return magv + " " + hoten + " " + bomonVT;
	}
	
}