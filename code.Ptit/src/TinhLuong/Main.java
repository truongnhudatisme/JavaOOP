package TinhLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Department> listDepartments = new ArrayList<>();
        ArrayList<Staff> listStaffs = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+", 2);
            listDepartments.add(new Department(argv[0],argv[1]));
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            listStaffs.add(new Staff(id,sc.nextLine(),sc.nextLine(),sc.nextLine(),findDepartment(listDepartments,id.substring(3))));
        }
        // String condition = sc.nextLine();
        // for (Department department : listDepartments) {
        //     if(department.getId().equals(condition)){
        //         System.out.println("Bang luong phong "+ department.getName() +":");
        //         break;
        //     }
        // }
        // for (Staff staff : listStaffs) {
        //     if(staff.getDepId().equals(condition)){
        //         System.out.println(staff);
        //     }
        // }
        for (Staff staff : listStaffs) {
            System.out.println(staff);
        }
        sc.close();

    }
    private static Department findDepartment(ArrayList<Department> listDepartments,String id){
        for (Department department : listDepartments) {
            if(department.getId().equals(id))
                return department;
        }
        return null;
    }
}
