package NhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Items> listItems = new ArrayList<>();
        ArrayList<Store> listStore = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i =0; i < n; i++){
            listItems.add(new Items(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+");
            listStore.add(new Store(findItem(listItems, argv[0]), argv[1], argv[2], argv[3]));
        }
        listStore.forEach(System.out::println);
        sc.close();
    }
    private static Items findItem(ArrayList<Items> listItems,String item_id){
        for(Items item: listItems){
            if(item.getItem_id().equals(item_id))
                return item;
        }
        return null;
    }
}
