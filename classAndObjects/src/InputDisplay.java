public class InputDisplay {
    public static void main(String[] args) {

        System.out.println("Bike information");
        System.out.println("----------------------------------------------------------------------------");
        Bike bike1 = new Bike("Next", "Aluminum", 1000, "MTB", 26);
        bike1.displayInfo();
        System.out.println("\nEquipment \n--------------------------------------------------------------------------");
        Equipment bike1E = new Equipment("Shimano", "Shimano", 7, 3, "Shimano trigger");
        bike1E.displayEquipment();


    }
}