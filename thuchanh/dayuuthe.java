import java.util.*;
import java.util.stream.Stream;
public class dayuuthe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] argv = sc.nextLine().split("\\s+");
            int argv_size = argv.length;
            int countodd = 0, counteven = 0;
            for(int i = 0; i < argv.length; i++){
                if(Integer.parseInt(argv[i]) % 2 == 1){
                    countodd++;
                }
                else{
                    counteven++;
                }
            }
            if(argv_size%2==0 && counteven > countodd){
                System.out.println("YES");
            }
            else if(argv_size%2==1 && countodd > counteven){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
