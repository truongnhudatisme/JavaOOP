package BangDiemThanhPhan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<SinhVien> ds = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			String masv = sc.nextLine();
			String hoten = sc.nextLine();
			String lop = sc.nextLine();
			double[] arr = new double[3];
			for(int j = 0; j < arr.length; j++)
				arr[j] = Double.parseDouble(sc.nextLine());
			ds.add(new SinhVien(masv,hoten,lop,arr));
		}
		Collections.sort(ds);
		int count = 0;
		for(SinhVien sv: ds) {
			System.out.printf("%d ",++count);
			System.out.println(sv);
		}
	}

}
