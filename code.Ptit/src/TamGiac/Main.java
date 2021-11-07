package TamGiac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			for(int i = 0; i < 3; i++) {
				Point p1 = new Point(sc.nextInt(),sc.nextInt());
				Point p2 = new Point(sc.nextInt(),sc.nextInt());
				Point p3 = new Point(sc.nextInt(),sc.nextInt());
				System.out.println(TamGiac.dienTich(p1, p2, p3));
			}
		}

	}

}
