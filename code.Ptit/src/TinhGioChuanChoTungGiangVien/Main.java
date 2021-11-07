package TinhGioChuanChoTungGiangVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        ArrayList<LopHocPhan> dslhp = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+",2);
            dsmh.add(new MonHoc(argv[0], argv[1]));
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+",2);
            dsgv.add(new GiangVien(argv[0], argv[1]));
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+");
            dslhp.add(new LopHocPhan(argv[0], argv[1],argv[2]));
        }
        String condition = sc.nextLine();
        for(GiangVien gv: dsgv){
            if(gv.getMagiangvien().equals(condition)){
                System.out.println("Giang vien: " + gv.getTengiangvien());
            }
        }
        float tonggio = 0;
        for(LopHocPhan lhp : dslhp){
            if(lhp.getMagv().equals(condition)){
                float gioday = lhp.getGioday();
                tonggio += gioday;
                for(MonHoc mh: dsmh){
                    if(mh.getMamonhoc().equals(lhp.getMonhoc())){
                        System.out.println(mh.getTenmonhoc() + " " + gioday);
                    }
                }
            }
        }
        System.out.printf("Tong: %.2f",tonggio);
    }
}
