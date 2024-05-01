import java.util.*;
public class Main {
    public static void main(String [] args) {
        GenericArrayList arrList = new GenericArrayList();
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(6,3,7,24,75)
        );
        ArrayList<Double> doubleList = new ArrayList<> (Arrays.asList(7.523, 2.643, 6.4125, 4.5239, 4.536)
        );
        ArrayList<Character> charList = new ArrayList<> (Arrays.asList('L', 'M', 'A', 'O', 'O')
        );
        ArrayList<String> strList = new ArrayList<> (Arrays.asList("Hello", "Goodbye", "What", "こにちは", "何")
        );
        System.out.print("Integer array: ");
        arrList.printArrayList(intList);
        System.out.print("Double array: ");
        arrList.printArrayList(doubleList);
        System.out.print("Character array: ");
        arrList.printArrayList(charList);
        System.out.print("String array: ");
        arrList.printArrayList(strList);
    }
}
