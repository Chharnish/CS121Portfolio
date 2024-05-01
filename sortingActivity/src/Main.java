public class Main {
    public static void main(String[] args) {
        Sorting doSort = new Sorting();
        int[] myArray = doSort.getArray();
        System.out.println("Unsorted Array: " + doSort.toString(myArray));
        myArray = doSort.sortArray(myArray);
        System.out.println("Sorted Array: " + doSort.toString(myArray));
    }
}
