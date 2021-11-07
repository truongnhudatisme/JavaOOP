package BangTinhGioChuan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, ArrayList<MonHoc>> result = new HashMap<>();
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+",2);
            dsmh.add(new MonHoc(argv[0],argv[1]));
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            String[] argv1 = sc.nextLine().split("\\s+",2);
            dsgv.add(new GiangVien(argv1[0],argv1[1]));
        }
        int p = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < p; i++){
            String[] argv2 = sc.nextLine().split("\\s+");
            addToList(result,argv2[0],timMH(dsmh, argv2[1]));
        }
        result.get("GV01").forEach(System.out::println);
        // for(int i = 0; i < p; i++){
        //     String[] argv2 = sc.nextLine().split("\\s+");
        //     if(map.get(argv2[0]) == null){
        //         map.put(argv2[0],1);
        //     }
        //     else{
        //         map.put(argv2[0],map.get(argv2[0]) + 1);
        //     }
        //     GiangVien gv = timGV(dsgv,argv2[0]);
        //     if(map.get(argv2[0]) == 1){
        //         gv.setGioday(Float.parseFloat(argv2[2]));
        //     }
        //     else{
        //         gv.setGioday(gv.getGioday()+ Float.par;;;seFloat(argv2[2]));
        //     }
        // }
        // dsgv.forEach(System.out::println);
        // sc.close();
    }
    private static synchronized void addToList(HashMap<String, ArrayList<MonHoc>> result,String key, MonHoc mh){
        ArrayList<MonHoc> itemList = result.get(key);
        if(itemList == null){
            itemList = new ArrayList<>();
            itemList.add(mh);
            result.put(key,itemList);
        }
        else{
            if(!itemList.contains(mh))
                itemList.add(mh);
        }
    }
    private static GiangVien timGV(ArrayList<GiangVien> dsgv,String magv){
        for(int i = 0; i < dsgv.size(); i++){
            if(dsgv.get(i).getMagv().equals(magv))
                return dsgv.get(i);
        }
        return null;
    }

    private static MonHoc timMH(ArrayList<MonHoc> dsmh,String mahp){
        for(int i = 0; i < dsmh.size(); i++){
            if(dsmh.get(i).getMamon().equals(mahp))
                return dsmh.get(i);
        }
        return null;
    }

}
