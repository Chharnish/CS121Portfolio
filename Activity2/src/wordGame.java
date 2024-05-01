import javax.swing.*;
public class wordGame {
    public static void main(String[] args) {
        //defining int/string variables
        int age;
        String name;
        String city;
        String college;
        String major;
        String animalType;
        String petName;

        //assigning prompts

        name = JOptionPane.showInputDialog("What is your name?");
        age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        city = JOptionPane.showInputDialog("What city is your college in?");
        college = JOptionPane.showInputDialog("What is the name of your college?");
        major = JOptionPane.showInputDialog("What is your major?");
        animalType = JOptionPane.showInputDialog("What type of animal do you like?");
        petName = JOptionPane.showInputDialog("What is a good pet name?");

        //printing out information input

        JOptionPane.showMessageDialog(null, String.format("%S ", name) + "enjoys living in " + String.format("%S", city) + " and attends " + String.format("%S.", college));
        JOptionPane.showMessageDialog(null, String.format("%S", name) + " majors in " + String.format("%S,", major) + String.format(" is %S years old,", age) + " and loves " + String.format("%S.", animalType));
        JOptionPane.showMessageDialog(null, String.format("%S", name) + " has a pet " + String.format("%S", animalType) + " named " + String.format("%s", petName) + " living with them in their dormitory.");


    }
}
