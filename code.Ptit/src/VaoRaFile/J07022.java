
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> ds = new ArrayList<>();
        while(sc.hasNext()){
            String a = sc.next();
            if(isInteger(a))
                continue;
            else
                ds.add(a);
        }
        ds.stream().sorted().forEach(s -> System.out.printf("%s ",s));
    }
    private static boolean isInteger(String k){
        try {
            Integer.parseInt(k);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
