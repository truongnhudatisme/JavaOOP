package KetQuaXetTuyen;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ds.add(new ThiSinh(i,sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        for(ThiSinh ts: ds)
            System.out.println(ts);
        sc.close();
    }
}
