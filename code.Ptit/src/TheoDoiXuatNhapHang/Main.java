package TheoDoiXuatNhapHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<MatHang> ds = new ArrayList<>();
		for(int i = 0 ; i < n; i++) {
			ds.add(new MatHang(sc.nextLine(), Integer.parseInt(sc.nextLine())));
		}
		String s = sc.nextLine();
		Collections.sort(ds);
		for(MatHang mh : ds)
			if(mh.getMahang().contains(s))
				System.out.println(mh);

	}

}
