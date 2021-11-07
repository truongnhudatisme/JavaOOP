package LOPINTSET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IntSet {
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }
    public IntSet union(IntSet s){
        Set<Integer> ds = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            ds.add(Integer.valueOf(a[i]));
        }
        for(int i = 0; i < s.a.length; i++){
            ds.add(Integer.valueOf(s.a[i]));
        }
        List<Integer> targetList = new ArrayList<>(ds);
        targetList = targetList.stream().sorted().collect(Collectors.toList());
        int[] result = new int[targetList.size()];
        int i = 0;
        for (Integer integer : targetList) {
            result[i++] = integer;
        }
        return new IntSet(result);
    }
    @Override
    public String toString() {
        String s =  "";
        for(int i = 0; i < a.length; i++){
            s += (a[i] + " ");
        }
        return s.trim();
    }
    
}
