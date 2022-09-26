package lista01.ex09;

public class Program {
   public static void main(String[] args) {
        int arr[] = {32, 13, 31, 74, 57};
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();

        SortMachine smInsertion = new SortMachine(arr, insertion);
        smInsertion.runSort();
        smInsertion.printArray();

        SortMachine smSelection = new SortMachine(arr, selection);
        smSelection.runSort();
        smSelection.printArray();
   }
}
