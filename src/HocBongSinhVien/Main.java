package HocBongSinhVien;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        String[] s = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        for(int i = 0; i < n; i++){
            String tensv = sc.nextLine();
            String[] arg = sc.nextLine().split("\\s+");
            ds.add(new SinhVien(i,tensv, arg[0],arg[1]));
        }
        Collections.sort(ds);
        double diemtb = ds.get(m-1).getDiemtb();
        Collections.sort(ds, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien s1, SinhVien s2){
                if(s1.getStt() < s2.getStt())
                    return -1;
                else
                    return 1;
            }
        });
        for(SinhVien sv: ds){
            if(sv.getDiemtb() < diemtb)
                sv.setXeploai("KHONG");
        }
        for(SinhVien sv: ds){
            System.out.println(sv);
        }
        sc.close();
    }
}
