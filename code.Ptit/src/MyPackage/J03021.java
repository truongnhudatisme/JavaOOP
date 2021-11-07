package MyPackage;

import java.util.Scanner;

public class J03021 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            testCase();
        }
    }
    public static void testCase(){
        String[] argv = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        char[] s = sc.nextLine().toUpperCase().toCharArray();
        String tmp = "";
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < argv.length; j++){
                if(argv[j].contains(Character.toString(s[i]))){
                    // System.out.printf("%s in %s cua %d \n",s[i], argv[j], j+2);
                    tmp += (j+2);
                }
            }
        }
        // System.out.println(tmp);
        StringBuffer str = new StringBuffer(tmp);
        String tmp1 = str.reverse().toString();
        if(tmp.equals(tmp1))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
