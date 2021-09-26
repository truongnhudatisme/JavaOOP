package TongDaThuc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class DaThuc {
    private String dt;
    public DaThuc(String dt){
        this.dt = dt;
    }
    public DaThuc cong(DaThuc dt1){
        String dttrungian = this.dt + " + "+ dt1.dt;
        HashMap<String,Integer> ds = new HashMap<>();
        String[] s = dttrungian.split(" \\+ ");
        for(int i = 0 ; i < s.length; i++){
            String[] s1 = s[i].trim().split("\\*");
            if(ds.get(s1[1]) == null){
                ds.put(s1[1],Integer.parseInt(s1[0]));
            }
            else
                ds.put(s1[1],ds.get(s1[1]) + Integer.parseInt(s1[0]));
        }
        ArrayList<HangTu> dshangtu = new ArrayList<>();
        for (String name: ds.keySet()) {
            String key = name.toString();
            String value = ds.get(name).toString();
            dshangtu.add(new HangTu(Integer.parseInt(value),key));
        }
        Collections.sort(dshangtu);
        String kq = "";
        for(int k = 0; k < dshangtu.size()-1; k++){
            kq += dshangtu.get(k) + " + ";
        }
        kq += dshangtu.get(dshangtu.size()-1);
        kq.trim();
        return new DaThuc(kq);
    }
    @Override
    public String toString(){
        return dt;
    }
}
