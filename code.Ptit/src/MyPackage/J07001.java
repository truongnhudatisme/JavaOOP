package MyPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer,Integer> ds = new TreeMap<>();
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            if(ds.get(a) == null){
                ds.put(a,1);
            }
            else{
                ds.put(a,ds.get(a) + 1);
            }
        }
        for(Integer key: ds.keySet()){
            System.out.println(key + " " + ds.get(key));
        }
    }
}
