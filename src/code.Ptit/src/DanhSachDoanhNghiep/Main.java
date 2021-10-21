package DanhSachDoanhNghiep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<DoanhNghiep> ds = new ArrayList<>();
		for(int i = 0 ; i < n; i++) {
			ds.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
		}
		int q = Integer.parseInt(sc.nextLine());
		while(q-->0) {
			String[] arr = sc.nextLine().split("\\s+");
			ArrayList<DoanhNghiep> dn1 = new ArrayList<>();
			for(DoanhNghiep dn : ds) {
				if(Integer.parseInt(arr[0]) <= dn.getSoluong() && dn.getSoluong() <= Integer.parseInt(arr[1]))
					dn1.add(dn);
			}
			Collections.sort(dn1);
			System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %s DEN %s SINH VIEN:\n",arr[0],arr[1]);
			for(DoanhNghiep stt: dn1) {
				System.out.println(stt);
			}
			
		}
//		Collections.sort(ds);
//		for(DoanhNghiep dn : ds) {
//			System.out.println(dn);
//		}

	}

}
