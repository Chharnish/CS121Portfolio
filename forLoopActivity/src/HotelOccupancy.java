import java.util.*;
public class HotelOccupancy {
    public static void main(String[] args) {
        //special variables
        Scanner input = new Scanner(System.in);
        //normal variables
        System.out.print("Enter number of floors: ");
        int floors = input.nextInt();
        int rooms,occupied,totRooms=0,totOccupied=0, vacant;
        double occupancy;
        for (int i = 1; i <= floors; i++) {
            System.out.printf("Enter the number of rooms on floor %d: ", i);
            rooms = input.nextInt();
            System.out.print("How many of the floor's rooms are occupied?: ");
            occupied = input.nextInt();
            if (occupied > rooms) {
                occupied = rooms;
            }
            totRooms += rooms;
            totOccupied += occupied;
        }
        //math time
        vacant = totRooms-totOccupied;
        occupancy = (totOccupied*1.0)/totRooms;
        //printing out the info
        System.out.printf("""
Floors: %2d
Rooms: %2d
Occupied Rooms: %2d
Vacant Rooms: %2d
Occupancy: %.2f (%d%%)
                """, floors, totRooms, totOccupied, vacant, occupancy, (int)(occupancy*100.0));

    }
}

