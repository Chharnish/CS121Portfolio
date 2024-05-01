//import java.util.*;
import java.util.ArrayList;
public class StringArrayList {
    ArrayList<String> bikeList = new ArrayList<>();

    public void addBike(String cont){
        bikeList.add(cont);
    }
    public void remBike(String cont) {
        bikeList.remove(cont);
    }

    public int bikeSize() {
        return bikeList.size();
    }
    public String getBike(int index) {
        return bikeList.get(index);
    }
    public void listBikesReg() {
        for (int i = 0; i < bikeList.size(); i++) {
            System.out.println(bikeList.get(i));
        }
    }
    public void listBikesEn() {
        for (String bike : bikeList) {
            System.out.println(bike);
        }
    }



}
