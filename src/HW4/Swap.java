package HW4;

public class Swap {
    static Integer []swap(Integer[]arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        return arr;
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1,2,3,4,5,6,7};
        PrintArray.printArray(swap(arr, 3 ,arr.length - 1));
    }
}
