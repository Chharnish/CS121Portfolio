public class Equipment {
    String frontDerailleur;
    String rearDerailleur;
    int speedRear;
    int speedFront;
    String shiftersType;

    public Equipment(String front, String rear, int speedR, int speedF, String shifters) {
        this.frontDerailleur = front;
        this.rearDerailleur = rear;
        this.speedRear = speedR;
        this.speedFront = speedF;
        this.shiftersType = shifters;
    }
    public void displayEquipment(){
        System.out.println("The bike has a " + frontDerailleur + " front Derailleur.");
        System.out.println("The bike has a " + rearDerailleur + " rear derailleur.");
        System.out.println("The bike is a " + speedFront + " x " + speedRear + " speed.");
        System.out.println("The bike has " + shiftersType + " type shifters.");
    }


}
