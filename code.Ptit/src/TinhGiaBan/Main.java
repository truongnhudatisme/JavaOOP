package TinhGiaBan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MatHang> ds = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= n; i++) {
			ds.add(new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		}
		Collections.sort(ds);
		for(MatHang mh : ds)
			System.out.println(mh);
	}

}
