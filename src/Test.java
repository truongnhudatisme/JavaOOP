import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" \\+ ");
        for(int i = 0 ; i < s1.length; i++){
            // System.out.println(s1[i]);
            String[] s2 = s1[i].replace("*x^"," ").split("\\s+");
            System.out.println(s2[0]+ " " + s2[1]);
            // System.out.println(s2[0]);
    }
}
}
