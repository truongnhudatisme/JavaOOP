package BangLuongTheoPhongBan;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhongBan> dspb = new ArrayList<>();
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        int a = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < a; i++){
            String arg= sc.nextLine();
            // System.out.println(arg.substring(0,2) + " " + arg.substring(2));
            dspb.add(new PhongBan(arg.substring(0,2),arg.substring(2)));
        }
        int b = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < b; i++){
            dsnv.add(new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),dspb));
        }
        String kt = sc.nextLine();
        for(int i = 0; i < dsnv.size(); i++){
            if(dsnv.get(i).getMaphong().equals(kt)){
                System.out.println("Bang luong phong" + dsnv.get(i).getTenphong() + ":");
                System.out.println(dsnv.get(i));
            }
        }
    }
}
