package J05012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            ds.add(new Shop(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        Collections.sort(ds);
        for(Shop s: ds)
            System.out.println(s);
        sc.close();
    }
}
