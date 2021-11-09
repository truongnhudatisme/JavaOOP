package ChuanHoaDanhSachSV;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        // Scanner sc = new Scanner(new File("code.Ptit\\src\\ChuanHoaDanhSachSV\\SINHVIEN.in"));
        ArrayList<SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            ds.add(new SinhVien(i,sc.nextLine(),sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
        sc.close();
    }
}
