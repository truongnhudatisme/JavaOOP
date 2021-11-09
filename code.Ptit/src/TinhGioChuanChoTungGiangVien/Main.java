package TinhGioChuanChoTungGiangVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        ArrayList<LopHocPhan> dslhp = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+",2);
            dsmh.add(new MonHoc(argv[0], argv[1]));
        }
        sc.close();
        sc = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+",2);
            dsgv.add(new GiangVien(argv[0], argv[1]));
        }
        sc.close();
        sc = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+");
            dslhp.add(new LopHocPhan(argv[0], argv[1],argv[2]));
        }
        sc.close();
        // String condition = sc.nextLine();
        // for(GiangVien gv: dsgv){
        //     if(gv.getMagiangvien().equals(condition)){
        //         System.out.println("Giang vien: " + gv.getTengiangvien());
        //     }
        // }
        for(GiangVien gv: dsgv){
            String ten = gv.getTengiangvien();
            String ma = gv.getMagiangvien();
            float tonggio = 0;
            for (LopHocPhan lopHocPhan : dslhp) {
                if(ma.equals(lopHocPhan.getMagv())){
                    float gioday = lopHocPhan.getGioday();
                    tonggio += gioday;
                }
            }
            System.out.printf("%s %.2f\n",ten,tonggio);
        }
        // float tonggio = 0;
        // for(LopHocPhan lhp : dslhp){
        //     if(lhp.getMagv().equals(condition)){
        //         float gioday = lhp.getGioday();
        //         tonggio += gioday;
//                for(MonHoc mh: dsmh){
//                    if(mh.getMamonhoc().equals(lhp.getMonhoc())){
//                        System.out.println(mh.getTenmonhoc() + " " + gioday);
//                    }
//                }
        }
        // }
        // System.out.printf(" %.2f",tonggio);
    // }
}
