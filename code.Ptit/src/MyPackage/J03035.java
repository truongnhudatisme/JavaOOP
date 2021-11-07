package MyPackage;

import java.util.Arrays;
import java.util.Scanner;

public class J03035 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            testCase();
        }
    }
    public static void testCase(){
        String a = sc.nextLine();
        String b = sc.nextLine();
        int[][] dp = new int[a.length()][2];
        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < 2; j++)
                dp[i][j] = 0;
        }
        if(a.charAt(0) == '?'){
            dp[0][0] = 1;
            dp[0][1] = 9 - (b.charAt(0) - '0'); 
        }
        else if(a.charAt(0) > b.charAt(0)){
            dp[0][0] = 0;
            dp[0][1] = 1;
        }
        else{
            System.out.println(0);
            return;
        }
        for(int i = 1; i < a.length(); i++){
            if(a.charAt(i) == '?' && b.charAt(i) != '?'){
                dp[i][0] = dp[i-1][0];
                dp[i][1] = dp[i-1][1]*10 + dp[i-1][0]*(9 - (b.charAt(i) - '0'));
            }
            else{
                if(a.charAt(i) == b.charAt(i)){
                    dp[i][0] = dp[i - 1][0];
                    dp[i][1] = dp[i - 1][1];
                } 
                else {
                    dp[i][0] = 0;
                    dp[i][1] = dp[i - 1][1];
                }
            }
        }
        System.out.println(dp[a.length()-1][1]);
    }
}
