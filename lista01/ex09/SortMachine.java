package lista01.ex09;

public class SortMachine {
    private int[] arr;
    private Sort sort;
    
    public SortMachine(int[] arr, Sort sort) {
        this.arr = arr;
        this.sort = sort;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void runSort() {
        getSort().runSort(getArr());
    }

    public void printArray() {
        getSort().printArray(getArr());
    }
}
