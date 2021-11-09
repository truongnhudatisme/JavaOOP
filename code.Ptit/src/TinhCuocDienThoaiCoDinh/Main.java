package TinhCuocDienThoaiCoDinh;


import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<City> listCities = new ArrayList<>();
        ArrayList<CallDetails> listDetails = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            listCities.add(new City(sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] argv = sc.nextLine().split("\\s+");
            City city = findCity(listCities, argv[0].substring(1,3));
            if(city != null)
                listDetails.add(new CallDetails(argv[0], argv[1], argv[2], findCity(listCities,argv[0].substring(1,3))));
            else{
                listDetails.add(new CallDetails(argv[0], argv[1], argv[2]));
            }
        }
        Collections.sort(listDetails);
        for (CallDetails callDetails : listDetails) {
            System.out.println(callDetails);
        }
    }
    private static City findCity(ArrayList<City> listCities,String zipCode){
        for (City city : listCities) {
            if(city.getZipCode().equals(zipCode))
                return city;   
        }
        return null;
    }
}
