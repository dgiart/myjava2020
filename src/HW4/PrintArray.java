package HW4;

public class PrintArray {
    public static void main(String[] args) {
//        String arr1[] = new String[]{"one","two"};
//        Integer arr2[] = new Integer[]{1,2,3};
//        printArray(arr1);
//        printArray(arr2);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 6; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        sb.delete(sb.length()-2,sb.length());
        System.out.println(sb);
    }
    static <T> void printArray(T []arr){
        StringBuilder elements = new StringBuilder();
        elements.append("[");
        for (T el:
             arr) {
            elements.append(el.toString());
            elements.append(", ");
        }
        elements.delete(elements.length()-2,elements.length());
        elements.append("]");
        System.out.println(elements);
    }
}
