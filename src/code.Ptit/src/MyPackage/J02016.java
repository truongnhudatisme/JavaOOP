package MyPackage;

import java.util.HashMap;
import java.util.Scanner;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer,Integer> dskey = new HashMap<>();
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
                if(dskey.get(arr[i]) == null){
                    dskey.put(arr[i],1);
                }
                else{
                    dskey.put(arr[i],dskey.get(arr[i]));
                }
            }
            if(checkTriplet(arr, n,dskey))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean checkTriplet(int arr[], int n, HashMap<Integer, Integer> dskey){
    // Iterate for all possible a
    for (int i = 1; i < n; i++)
    {
        if (dskey.get(arr[i]) == 0)
            continue;
        for (int j = 1; j < n; j++)
        {
            if ((i == j && dskey.get(arr[j])== 1) || dskey.get(arr[j]) == 0)
                continue;
 
            // Find c
            int val = (int) Math.sqrt(i * i + j * j);
 
            // If c^2 is not a perfect square
            if ((val * val) != (i * i + j * j))
                continue;

            if (dskey.get(val) == 1)
            {
                return true;
            }
        }
    }
        return false;
    }
}
