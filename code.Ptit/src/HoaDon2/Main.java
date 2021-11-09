package HoaDon2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // Scanner sc = new Scanner(new File("code.Ptit\\src\\HoaDon2\\KH.in"));
        Scanner sc = new Scanner(new File("KH.in"));
        ArrayList<Guest> listguests = new ArrayList<>();
        ArrayList<Product> listproducts = new ArrayList<>();
        ArrayList<Bill> listbilles = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            listguests.add(new Guest(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        sc.close();
        // sc = new Scanner(new File("code.Ptit\\src\\HoaDon2\\MH.in"));
        sc = new Scanner(new File("MH.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            listproducts.add(new Product(sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("HD.in"));
        // sc = new Scanner(new File("code.Ptit\\src\\HoaDon2\\HD.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i =0 ;i < n; i++){
            String[] argv = sc.nextLine().split("\\s+");
            listbilles.add(new Bill(findGuest(listguests,argv[0]),findProduct(listproducts, argv[1]),argv[2]));
        }
        for (Bill bill : listbilles) {
            System.out.println(bill);
        }
        sc.close();
    }
    private static Guest findGuest(ArrayList<Guest> listguests, String guest_code){
        for (Guest guest : listguests) {
            if(guest.getGuest_code().equals(guest_code))
                return guest;
        }
        return null;
    }
    private static Product findProduct(ArrayList<Product> listproducts, String product_code){
        for (Product product : listproducts) {
            if(product.getProduct_code().equals(product_code))
                return product;
        }
        return null;
    }
}
