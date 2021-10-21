package SapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<GiangVien> ds = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			ds.add(new GiangVien(i,sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(ds);
		for(GiangVien gv: ds) {
			System.out.println(gv);
		}
	}
}
