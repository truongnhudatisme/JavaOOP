package TongDaThuc2;

import java.util.ArrayList;
import java.util.Collections;

public class DaThuc {
    private String dathuc;
    public DaThuc(String dathuc){
        this.dathuc = dathuc;
    }
    public DaThuc cong(DaThuc d1){
        ArrayList<HangTu> dsht = new ArrayList<>();
        String[] dtht = this.dathuc.split(" \\+ ");
        for(int i = 0 ; i < dtht.length; i++){
            String[] parseht = dtht[i].trim().replace("*x^"," ").split("\\s+");
            dsht.add(new HangTu(Integer.parseInt(parseht[0]),Integer.parseInt(parseht[1])));
        }
        String[] dtcong = d1.dathuc.split(" \\+ ");
        for(int j = 0 ; j < dtcong.length; j++){
            boolean checkAdd = true;
            String[] parsecong = dtcong[j].trim().replace("*x^", " ").split("\\s+");
            for(HangTu ht: dsht){
                if(ht.getBac() == Integer.parseInt(parsecong[1])){
                    int hs = ht.getHeso();
                    ht.setHeso(hs + Integer.parseInt(parsecong[0]));
                    checkAdd = false;
                }
            }
            if(checkAdd){
                dsht.add(new HangTu(Integer.parseInt(parsecong[0]),Integer.parseInt(parsecong[1])));
            }
        }
        Collections.sort(dsht);
        String s = "";
        for(int k = 0; k < dsht.size() - 1; k++){
            s += dsht.get(k) + " + ";
        }
        s+= dsht.get(dsht.size()-1);
        return new DaThuc(s);
    }
    @Override
    public String toString(){
        return dathuc;
    }
}
