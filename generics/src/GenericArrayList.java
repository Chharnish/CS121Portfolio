import java.util.ArrayList;
public class GenericArrayList {
    public <E> void printArrayList(ArrayList<E> inArray){
        for (E element : inArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
