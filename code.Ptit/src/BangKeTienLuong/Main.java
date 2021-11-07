package BangKeTienLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<NhanVien> ds = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i =1; i <= n; i++) {
			ds.add(new NhanVien(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
		}
		int sum = 0;
		for(NhanVien nv: ds) {
			System.out.println(nv);
			sum += nv.getThuclinh();
		}
		System.out.printf("Tong chi phi tien luong: %d",sum);

	}

}
