package J05015;

public class VanDongVien implements Comparable<VanDongVien>{
    private String hoten, donvi,thoigian;
    private String ma;
    private int vantoc;
    private double time;
    public VanDongVien(String hoten, String donvi, String thoigian) {
        this.hoten = hoten;
        this.donvi = donvi;
        this.thoigian = thoigian;
        findMa(donvi, hoten);
        findGio();
    }
    
    private void findMa(String donvi, String hoten){
        StringBuilder s  = new StringBuilder();
        String [] s1 = donvi.split("\\s+");
        String [] s2 = hoten.split("\\s+");
        for(int i = 0; i < s1.length; i++){
            s.append(Character.toUpperCase(s1[i].charAt(0)));
        }
        for(int i = 0; i < s2.length; i++){
            s.append(Character.toUpperCase(s2[i].charAt(0)));
        }
        ma = s.toString().trim();
    }
    
    private void findGio(){
        String[] s = thoigian.split(":");
        double gio = (double) Integer.parseInt(s[0]) - 6;
        double phut = (double) Integer.parseInt(s[1]) / 60;
        time = gio + phut;
        vantoc =  (int) Math.round(120/time);
    }

    @Override
    public int compareTo(VanDongVien o) {
        if(this.time < o.time)
            return -1;
        else if(this.time == o.time)
            return 0;
        else
            return 1;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + donvi + " " + vantoc +" Km/h";
    }
    
}
