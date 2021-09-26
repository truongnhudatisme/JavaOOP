package J04009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
            Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(),sc.nextDouble());
            System.out.println(Tamgiac.dienTich(p1, p2, p3));
        }
        sc.close();
    }
}
