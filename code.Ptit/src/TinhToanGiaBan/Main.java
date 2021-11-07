package TinhToanGiaBan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] arg = sc.nextLine().split("\\s+");
            ds.add(new MatHang(arg[0], arg[1],arg[2]));
        }
        ds.forEach(System.out::println);
    }
}
