package TinhToanHoaDonBanQuanAo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> dsMathang = new ArrayList<>();
        ArrayList<HoaDon> dsHoadon = new ArrayList<>();
        int soluongmh = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < soluongmh; i++){
            dsMathang.add(new MatHang(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int soluonghd = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= soluonghd; i++){
            String[] argv = sc.nextLine().split("\\s+");
            dsHoadon.add(new HoaDon(i,argv[0],argv[1], dsMathang));
        }
        Collections.sort(dsHoadon);
        for(HoaDon hd: dsHoadon){
            System.out.println(hd);
        }
        sc.close();
    }
}
