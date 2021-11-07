package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s =sc.nextLine();
            if(s.equals("END"))
                break;
            StringTokenizer s1 = new StringTokenizer(s);
            StringBuilder res = new StringBuilder();
            while(s1.hasMoreTokens()){
                String tmp  = s1.nextToken();
                res.append(Character.toUpperCase(tmp.charAt(0)));
                for(int i = 1; i < tmp.length(); i++){
                    res.append(Character.toLowerCase(tmp.charAt(i)));
                }
                res.append(" ");
            }
            System.out.println(res.toString().trim());
        }
    }
}
