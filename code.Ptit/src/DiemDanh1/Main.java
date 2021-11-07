package DiemDanh1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> dssv = new ArrayList<>();
        ArrayList<DiemDanh> dsdd = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            dssv.add(new SinhVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        for(int i = 1; i <= n; i++){
            String[] argv = sc.nextLine().split("\\s+");
            dsdd.add(new DiemDanh(findSV(dssv,argv[0]),argv[1]));
        }
        Collections.sort(dsdd);
        // dsdd.forEach(System.out::println);
        String lop = sc.nextLine();
        for(int i = 0; i < dssv.size(); i++){
            if(dssv.get(i).getLop().equals(lop))
                System.out.println(dssv.get(i));
        }
    }
    public static SinhVien findSV(ArrayList<SinhVien> dssv,String masv){
        for(int i = 0; i < dssv.size(); i++){
            if(masv.equals(dssv.get(i).getMasv()))
                return (SinhVien) dssv.get(i);
        }
        return null;
    }
}
