package HW4;

public class SortTest {
    static int[] sort(int[]arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
        return arr;
    }
    static int partition (int[]arr, int low, int high){
        int pivot = arr[high];
        int newlow = low - 1;
        for (int j = low; j <high ; j++) {
            if(arr[j] < pivot){
                newlow++;
                int temp = arr[newlow];
                arr[newlow] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[newlow+1];
        arr[newlow+1] = arr[high];
        arr[high] = temp;
        return newlow+1;
    }

    public static void main(String[] args) {
        int[]array = new int[]{7,6,1,2,3,4,5,2,7,1,5};
//        System.out.println(partition(array,0,array.length-1));
        for (int num:
             sort(array, 0,array.length-1)) {
            System.out.println(num);
        }
    }

}
