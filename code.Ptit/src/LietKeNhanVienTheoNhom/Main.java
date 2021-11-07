package LietKeNhanVienTheoNhom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String ma = s.substring(0,7);
            String ten = s.substring(7).trim();
            ds.add(new NhanVien(ma, ten));

        }
        for(NhanVien nv: ds){
            String cv = nv.getChucvu();
            String cv1 = nv.getSohieu();
            if(cv.equals("GD")){
                if(cv1.compareTo("001") > 0){
                    nv.setChucvu("NV");
                }
            }
            else if(cv.equals("TP")){
                if(cv1.compareTo("003") > 0){
                    nv.setChucvu("NV");
                }
            }
            else if(cv.equals("PP")){
                if(cv1.compareTo("003") > 0){
                    nv.setChucvu("NV");
                }
            }
            else 
                nv.setChucvu("NV");
        }
        Collections.sort(ds);
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q; i++){
            String condition = sc.nextLine();
            for(NhanVien nv: ds){
                if(nv.getTen().toLowerCase().contains(condition.toLowerCase()))
                    System.out.println(nv);
            }
            System.out.println();
        }
        sc.close();
    }
}
