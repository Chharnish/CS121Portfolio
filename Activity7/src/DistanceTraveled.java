import java.util.Scanner;
public class DistanceTraveled {
    public static void main(String[] args) {
        //declaring Scanner
        Scanner input = new Scanner(System.in);
        //declaring variables
        int distTraveled;
        System.out.println("Input the speed in MPH that you will be traveling.");
        int speedMPH = input.nextInt();
        System.out.println("input the amount of hours expected to travel.");
        int timeHours = input.nextInt();
        //doing le math
        distTraveled = speedMPH * timeHours;
        for (int i = 1; i <= timeHours; i++){
            int perHr = speedMPH * i;
            System.out.println("The distance traveled for " + i + " hours is " + perHr + " miles.");
        }

    }
}
