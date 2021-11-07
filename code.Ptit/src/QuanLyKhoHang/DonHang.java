package QuanLyKhoHang;

public class DonHang implements Comparable<DonHang> {
    private String madon;
    private int soluong;
    private int dongia;
    private long thue;
    private long tongtien;
    private String tenhang;
    public DonHang(String madon, String soluong){
        this.madon = madon;
        this.soluong = Integer.parseInt(soluong);
        xuly();
    }
    private void xuly(){
        char ma = madon.charAt(0);
        if(ma == 'X'){
        	dongia = 128000;
            tongtien =(long) dongia*soluong;
            thue = (long) Math.round(tongtien*3/100.0);
            tongtien = (long) tongtien + thue;
        }
        else if(ma == 'D'){
        	dongia = 11200;
            tongtien = (long) dongia*soluong;
            thue = (long) Math.round(tongtien*3.50/100.0);
            tongtien = (long) tongtien + thue;
        }
        else{
            dongia = 9700;
            tongtien =(long) dongia*soluong;
            thue = (long) Math.round(tongtien*2/100.0);
            tongtien = (long)tongtien + thue;
        }
        String mahangsx = madon.substring(madon.length()-2, madon.length());
        if(mahangsx.equals("BP")) tenhang = "British Petro";
        else if(mahangsx.equals("ES")) tenhang = "Esso";
        else if(mahangsx.equals("SH")) tenhang = "Shell";
        else if(mahangsx.equals("CA")) tenhang = "Castrol";
        else if(mahangsx.equals("MO")) tenhang = "Mobil";
        else{
            tenhang = "Trong Nuoc";
            thue = 0;
            tongtien = dongia*soluong;
        }
    }
    @Override
        public String toString(){
            return madon + " " + tenhang + " " + dongia + " " + thue + " " + tongtien;
        }
	@Override
	public int compareTo(DonHang o) {
		if(this.tongtien < o.tongtien)
				return 1;
		else if(this.tongtien == o.tongtien)
				return 0;
		else
			return -1;
	}

}