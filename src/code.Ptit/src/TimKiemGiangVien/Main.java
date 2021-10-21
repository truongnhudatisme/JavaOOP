package TimKiemGiangVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<GiangVien> ds = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			ds.add(new GiangVien(i, sc.nextLine(), sc.nextLine()));
		}
		int q = Integer.parseInt(sc.nextLine());
		while(q-->0) {
			String tukhoa = sc.nextLine();
			System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n",tukhoa);
			for(GiangVien gv: ds) {
				if(gv.getHoten().toLowerCase().contains(tukhoa.toLowerCase()))
					System.out.println(gv);
			}
		}

	}

}