package J03013;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1, s2;
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            int s1_size=s1.length(), s2_size=s2.length();
            int maxx = Math.max(s1_size, s2_size);
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger c = a.subtract(b);
            c = c.abs();
            int x = c.toString().length();
            for(int i=x; i< maxx; i++) 
                System.out.print("0");
            System.out.println(c);
        }
        sc.close();
    }
}
