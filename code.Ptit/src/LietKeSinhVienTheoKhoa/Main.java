package LietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<SinhVien> ds = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			ds.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
		}
		int q = Integer.parseInt(sc.nextLine());
		while(q-- > 0) {
			String khoahoc = sc.nextLine();
			System.out.printf("DANH SACH SINH VIEN KHOA %s:\n",khoahoc);
			for(SinhVien sv:ds) {
				if(sv.getKhoahoc().equals(khoahoc))
					System.out.println(sv);
			}
		}
		sc.close();

	}

}