package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07014 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        TreeSet<String> ds = new TreeSet<>();
        while(sc.hasNext()){
            ds.add(sc.next().toLowerCase());
        }
        sc = new Scanner(new File("DATA2.in"));
        while(sc.hasNext()){
            ds.add(sc.next().toLowerCase());
        }
        ds.forEach(s -> System.out.printf("%s ",s));
        sc.close();
    }
}
