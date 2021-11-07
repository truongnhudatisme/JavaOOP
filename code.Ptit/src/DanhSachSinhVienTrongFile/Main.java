package DanhSachSinhVienTrongFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            ds.add(new SinhVien(i, sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        ds.forEach(System.out::println);
    }
}
