package QuanLyKhoHang;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> ds = new ArrayList<>();
        int n  = Integer.parseInt(sc.nextLine());
        for(int i =0; i < n; i++){
            String[] arg = sc.nextLine().split("\\s+");
            ds.add(new DonHang(arg[0],arg[1]));
        }
        Collections.sort(ds);
        for(DonHang dh: ds)
            System.out.println(dh);
        sc.close();
    }
}