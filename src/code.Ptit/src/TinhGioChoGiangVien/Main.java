package TinhGioChoGiangVien;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocPhan> dshp = new ArrayList<>();
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        HashMap<String, Integer> tg = new HashMap<>();
        for(int i = 0; i < Integer.parseInt(sc.nextLine()); i++){
            String[] argv = sc.nextLine().split("\\s+");
            dshp.add(new HocPhan(argv[0], argv[1]));
        }
        for(int i = 0; i < Integer.parseInt(sc.nextLine()); i++){
            String[] argv = sc.nextLine().split("\\s+");
            dsgv.add(new GiangVien(argv[0], argv[1]));
        }
        for(int i = 0; i < Integer.parseInt(sc.nextLine()); i++){
            String[] argv = sc.nextLine().split("\\s+");
            
        }
    }
}
