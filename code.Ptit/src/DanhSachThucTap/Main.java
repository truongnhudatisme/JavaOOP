package DanhSachThucTap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<SinhVien> ds = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			ds.add(new SinhVien(i,sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(ds);
		int q = Integer.parseInt(sc.nextLine());
		while(q-->0) {
			String dn = sc.nextLine();
			for(SinhVien sv: ds) {
				if(sv.getDoanhnghiep().equals(dn))
					System.out.println(sv);
			}
		}
	}

}
