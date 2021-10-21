package INTSET;
import java.util.ArrayList;
import java.util.List;

public class IntSet {
    private List<Integer> ds = new ArrayList<>();
    private int[] data;
    public IntSet(int[] data){
        this.data = data;
        for(int i = 0; i < data.length; i++){
            ds.add(data[i]);
        }
    }
    public IntSet union(IntSet datanew){
        ds.addAll(datanew.ds);
        List<Integer> dsunion = ds.stream().distinct().toList();
        int[] result = new int[dsunion.size()];
        for(int i = 0; i < dsunion.size(); i++){
            result[i] = dsunion.get(i);
        }
        return new IntSet(result);
    }
    @Override
    public String toString(){
        String s = "";
        for(int i = 0 ; i < data.length - 1; i ++){
            s += data[i] + " ";
        }
        s += data[data.length-1];
        return s.trim();
    }
}
