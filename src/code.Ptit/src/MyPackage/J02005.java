package MyPackage;

import java.util.*;
public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        HashMap<Integer, Integer> ds = new HashMap<>();
        int[] arrn = new int[n];
        int[] arrm = new int[m];
        for(int i = 0; i < n; i++){
            arrn[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            arrm[i] = sc.nextInt();
        }
        int[] result = Arrays.stream(arrn).distinct().filter(x -> Arrays.stream(arrm).anyMatch(y -> y == x)).toArray();
        for(int i = 0; i < result.length; i++)
            System.out.printf("%d ",result[i]);
        System.out.println();
    }
}
