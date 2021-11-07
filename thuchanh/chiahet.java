import java.math.BigInteger;
import java.util.*;
public class chiahet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] argv = sc.nextLine().split("\\s+");
            BigInteger a = new BigInteger(argv[0]);
            BigInteger b = new BigInteger(argv[1]);
            if(a.mod(b).toString().equals("0") || b.mod(a).toString().equals("0")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
