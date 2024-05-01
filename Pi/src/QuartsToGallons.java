public class QuartsToGallons {
    public static void main(String[] args) {
         //declaring variables
         int gallon2Quarts = 4;
         int quartsNeeded = 18;
         int totalNeeded;
         int remainder;
         //basic needs
         totalNeeded = quartsNeeded / gallon2Quarts;
         //remainder of the total
         remainder = quartsNeeded % gallon2Quarts;
         //print statement
         System.out.println(String.format("The total needed for the job is %d gallons ", totalNeeded) + String.format("and %d quarts.", remainder));
    }
}
