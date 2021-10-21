package LietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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
			String str = sc.nextLine();
			String fullTenNganhBefore = "";
			if(str.equals("Ke toan"))
				fullTenNganhBefore += "DCKT";
			else if(str.equals("Cong nghe thong tin"))
				fullTenNganhBefore += "DCCN";
			else if(str.equals("An toan thong tin"))
				fullTenNganhBefore += "DCAT";
			else if(str.equals("Vien thong"))
				fullTenNganhBefore += "DCVT";
			else fullTenNganhBefore += "DCDT";
			StringBuilder fullTenNganhAfter = new StringBuilder();
			StringTokenizer tmp = new StringTokenizer(str);
			while(tmp.hasMoreTokens()) {
				String a = tmp.nextToken();
				for(int i = 0; i < a.length(); i++)
					fullTenNganhAfter.append(Character.toUpperCase(a.charAt(i)));
				fullTenNganhAfter.append(" ");
			}
			System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",fullTenNganhAfter.toString().trim());
			for(SinhVien sv : ds) {
				if(sv.getMasv().contains(fullTenNganhBefore)) {
					if(fullTenNganhBefore.equals("DCCN") || fullTenNganhBefore.equals("DCAT")) {
						if(sv.getLop().charAt(0) == 'E')
							continue;
						else
							System.out.println(sv);
					}
					else 
						System.out.println(sv);
				}
			}
		}
		sc.close();
	}
}
