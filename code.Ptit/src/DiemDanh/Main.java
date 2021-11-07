package DiemDanh;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> dssv = new ArrayList<>();
        ArrayList<Diemdanh> dsdd = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            dssv.add(new SinhVien(i,sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+");
            dsdd.add(new Diemdanh(argv[0], argv[1], dssv));
        }
        String ktdk = sc.nextLine();
        // Collections.sort(dsdd);
        for(int i = 0; i < dsdd.size(); i++){
            if(ktdk.equals(dsdd.get(i).getLop()))
                System.out.println(dsdd.get(i));
        }
        sc.close();
    }
}
