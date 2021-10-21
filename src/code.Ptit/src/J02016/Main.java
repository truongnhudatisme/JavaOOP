package J02016;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> ds = new HashMap<>();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
                arr[i] *= arr[i];
            }
            Arrays.sort(arr);
            for(int i = 0; i < arr.length; i++){
                if(ds.get(i) == null){
                    ds.put(arr[i],1);
                }
                else 
                    ds.put(arr[i],ds.get(arr[i]) + 1);
            }
            
        }
    }
}
