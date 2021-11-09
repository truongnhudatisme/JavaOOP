package Lophocphan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PartClass> listClasses = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            listClasses.add(new PartClass(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i =0; i < n; i++){
            String condition = sc.nextLine();
            for (PartClass partClass : listClasses) {
                if(partClass.getInstructor_name().equals(condition)){
                    System.out.printf("Danh sach cho giang vien %s:\n",condition);
                    break;
                }
            }
            listClasses.stream().filter(s -> s.getInstructor_name().equals(condition)).sorted().forEach(System.out::println);
            // for (PartClass partClass : listClasses) {
            //     if(partClass.getSubject_code().equals(condition)){
            //         System.out.println("Danh sach nhom lop mon " + partClass.getSubject_name() + ":");
            //         break;
            //     }
            // }
            // listClasses.stream().filter(s -> s.getSubject_code().equals(condition)).sorted().forEach(System.out::println);
        }
        sc.close();
    }
}
