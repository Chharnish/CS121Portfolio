import javax.swing.*;
public class RestaurantSelector {
    public static void main(String[] args) {
        String vegetarian = JOptionPane.showInputDialog("Is anyone in your party a vegetarian?").toUpperCase();
        String vegan = JOptionPane.showInputDialog("Is anyone in your party a vegan?").toUpperCase();
        String glutenFree = JOptionPane.showInputDialog("Does anyone in your party require Gluten free options?").toUpperCase();
        String Restaurants = "\n";
        boolean vege = false;
        boolean vega = false;
        boolean gluten = false;

        if (vegetarian.equals("YES")) {
            vege = true;
        }
        if (vegan.equals("YES")) {
            vega = true;
        }
        if (glutenFree.equals("YES")) {
            gluten = true;
        }
        //Joe's Gourmet Burgers
        if (vege){
            if(vega) {
                if (gluten){
                    break;
                }
            }
        }
        else {
            Restaurants += "Joe's Gourmet Burgers\n";
        }
        //Main Street Pizza Company
        if (vege){
            if(gluten) {
                if (vega){
                    break;
                }
                else {
                    Restaurants += "Main Street Pizza Company\n";
                }

            }
        }
        //Corner Cafe
        if (vege){
            if(vega) {
                if (gluten){
                    Restaurants += "Corner Cafe\n";
                }
            }
        }
        //Mama's Fine Italian
        if (vege){
            if(vega) {
                if (gluten){

                }
            }
            else {
                Restaurants += "Mama's Fine Italian\n";
            }
        }
        //The Chef's Kitchen
        if (vege){
            if(vega) {
                if (gluten){
                    Restaurants += "The Chef's Kitchen\n";

                }
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Your restaurant choices are:", Restaurants));

    }
}
