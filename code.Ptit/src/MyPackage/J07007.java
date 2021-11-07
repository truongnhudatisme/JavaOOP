package MyPackage;

import java.io.*;
import java.util.*;
public class J07007 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ds = new TreeSet<String>();
        while(sc.hasNextLine()){
            String[]s = sc.nextLine().split("\\s+");
            for(int i = 0; i < s.length; i++){
                ds.add(s[i].toLowerCase());
            }
        }
        ds.forEach(System.out::println);
        sc.close();
    }
}
