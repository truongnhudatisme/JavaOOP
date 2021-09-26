package TongDaThuc1;

import java.util.ArrayList;
import java.util.Collections;

public class DaThuc {
    private String dathuc;
    public DaThuc(String dathuc){
        this.dathuc = dathuc;
    }

    public DaThuc cong(DaThuc d1){
        ArrayList<HangTu> dshangtu = new ArrayList<>();
        String[] s = dathuc.split("\\+");
        for(int i = 0; i < s.length; i++){
            String[] tmp = s[i].trim().split("\\*");
            dshangtu.add(new HangTu(Integer.parseInt(tmp[0]),tmp[1]));
        }
        String[] s1 = d1.dathuc.split("\\+");
        for(int j = 0; j < s1.length; j++){
            boolean checkAdd = true;
            String[] tmp1 = s1[j].trim().split("\\*");
            for(HangTu ht: dshangtu){
                if(ht.getBac().equals(tmp1[1])){
                    int hs = ht.getHeso();
                    ht.setHeso(hs+Integer.parseInt(tmp1[0]));
                    checkAdd = false;
                }
            }
            if(checkAdd){
                dshangtu.add(new HangTu(Integer.parseInt(tmp1[0]),tmp1[1]));
            }
        }
        Collections.sort(dshangtu);
        StringBuilder kq = new StringBuilder();
        for(int k = 0; k < dshangtu.size()-1; k++){
            kq.append(dshangtu.get(k).toString());
            kq.append(" + ");
        }
        kq.append(dshangtu.get(dshangtu.size()-1).toString());
        return new DaThuc(kq.toString());

    }
    @Override
    public String toString(){
        return dathuc;
    }
}
