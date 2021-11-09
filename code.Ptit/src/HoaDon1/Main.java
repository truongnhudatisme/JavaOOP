package HoaDon1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        // Scanner sc = new Scanner(new File("code.Ptit\\src\\Hoadon12\\DATA1.in"));
        ArrayList<Product> listProducts = new ArrayList<>();
        ArrayList<Receipt> listReceipts = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i =0; i < n; i++){
            listProducts.add(new Product(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        sc.close();
        sc = new Scanner(new File("DATA2.in"));
        // sc = new Scanner(new File("code.Ptit\\src\\Hoadon12\\DATA2.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i =0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+");
            listReceipts.add(new Receipt(findProduct(listProducts,argv[0]), argv[0], argv[1]));
        }
        for (Receipt receipt : listReceipts) {
            System.out.println(receipt);
        }
        sc.close();
    }
    private static Product findProduct(ArrayList<Product> listProducts,String id){
        for (Product product : listProducts) {
            if(product.getId().equals(id.substring(0,2)))
                return product;
        }
        return null;
    }
}
