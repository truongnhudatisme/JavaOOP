package ClubBongDa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HashMap<String, Integer> dskey = new HashMap<>();
        ArrayList<TranDau> ds = new ArrayList<>();
        ArrayList<DoanhThu> dsdt = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String maclb = sc.nextLine();
            String tenclb = sc.nextLine();
            String giave = sc.nextLine();
            // dskey.put(maclb,i);
            ds.add(new TranDau(maclb, tenclb, giave));
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            String[] arg = sc.nextLine().split("\\s+");
            // String key = arg[0].substring(1,3);
            dsdt.add(new DoanhThu(arg[0], arg[1], ds));
            // for(BongDa bd: ds){
            //     if(bd.getMaclb().equals(key)){
            //         bd.setMatrandau(arg[0]);
            //         bd.setSoluong(arg[1]);
            //     }
            // }
            // ds.get(dskey.get(key)).setMatrandau(arg[0]);
            // ds.get(dskey.get(key)).setSoluong(arg[1]);
        }
        Collections.sort(dsdt);
        for(DoanhThu dt: dsdt)
            System.out.println(dt);
        sc.close();
    }
}
