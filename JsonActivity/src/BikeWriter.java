import java.io.*;
import com.google.gson.Gson;
public class BikeWriter {
    public static void main(String[] args) throws IOException{
        Bike myBike = new Bike("Bichael", 472348, true, 34.63);
        Gson gson = new Gson();
        try {
            String jsonString = gson.toJson(myBike);
            FileWriter filewriter = new FileWriter("bikes.json");
            filewriter.write(jsonString);
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace(); //NO I AM NOT REPLACING WITH "more robust logging"" RAAAAAAAAAHHH
        }
    }
}
