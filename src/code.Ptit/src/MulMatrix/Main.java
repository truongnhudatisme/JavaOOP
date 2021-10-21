package MulMatrix;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        // Matrix a = new Matrix(n,m);
        // a.nextMatrix(sc);
        // Matrix b = new Matrix(m,p);
        // b.nextMatrix(sc);
        // System.out.println(a.mul(b));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.printf("Test %d:\n",i);
            System.out.println(a.mul(b));
        }
    }   
}
