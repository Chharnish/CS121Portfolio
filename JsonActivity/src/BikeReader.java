import com.google.gson.Gson;
import java.io.*;
public class BikeReader {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            Bike myBike = null;
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("bikes.json"));
            myBike = gson.fromJson(reader, Bike.class);
            System.out.println(myBike.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
