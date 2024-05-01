import java.util.Scanner;
public class Sorting {
    private final Scanner input = new Scanner(System.in);
    public int[] getArray() {
        int[] array = new int[10];
        int temp;
        for (int i = 1; i < array.length+1; i++) {
            System.out.printf("Enter integer %d: ", i);
            temp = input.nextInt();
            array[i-1] = temp;
        }
        return array;

    }
    public int[] sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public String toString(int[] array){

        StringBuilder arrStr = new StringBuilder();
        arrStr.append("[ ");
        for (int index : array) {
            arrStr.append(String.format("%d ", index));
        }
        arrStr.append("]");
        return arrStr.toString();
    }


}
