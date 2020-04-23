import java.util.*;


public class Digits23_04epam {
    static int len(int N){
        return (int)Math.log10(N)+1;
    }
    //converts int number to the array of digits
    static int[] digits(int N){
        int numdig=len(N);//number of digits
        int num=N;
        int[] dgs=new int[numdig];
        for (int i = 0; i <dgs.length ; i++) {
            dgs[i]=N%10;
            N=N/10;

        }
        return dgs;
    }
    //converts String array to int array
    static Integer[] strtoint(String[]st){
        Integer[] nums=new Integer[st.length];
        for (int i = 0; i <st.length ; i++) {
            nums[i]=Integer.parseInt(st[i]);
        }
        return nums;
    }
    //check array of digits for digits coincidence
    static boolean iscoincidence(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    return true;
                }
            }

        }
        return  false;
    }

    static Integer findmeanlen(Integer[] nums){
        Integer sum=0;
        Integer mean=0;
        for (Integer num:nums ) {
            sum+=len(num);
        }
        return sum/nums.length;
    }
    static ArrayList<Integer>[] getBiggerThenMean(ArrayList<Integer> nums){
        for (Integer num: nums) {
            if ( len(num) <findmeanlen(nums)){
            }
            return nums;
        }
    static Hashtable findmax(Integer [] nums){
        Hashtable<String, Integer> maxpair = new Hashtable<String, Integer>();
        int M=0;
        for (int num: nums) {
            if (num>M){
                M=num;
            }
        }
        maxpair.put("num",M);
        maxpair.put("len",len(M));
        return maxpair;
    }
    public static void main(String[] args) {
        Integer []nms=strtoint(args);
        for (int n:nms ) {
            System.out.println(len(n)+"\t"+n);
        }
//        int N=Integer.parseInt(args[0]);
//        System.out.println(Integer.toBinaryString(N));
//        int num = Integer.parseInt(args[0]);
//        int[] d=Digits23_04epam.digits(num);
//        for (int el:d) {
//            System.out.println(el);
//        }
//        System.out.println(iscoincidence(d));
        System.out.println("Max number in Args: "+findmax(nms).get("num")+" has "+findmax(nms).get("len")+" digits" );
//        System.out.println("Number "+my_dict.get("num")+" has length "+my_dict.get("len"));
//        for (int n:nms ) {
//            my_dict.put(n,len(n));
//        }

        List<Integer> numlist = new ArrayList<Integer>();
        Collections.addAll(numlist,nms);
        System.out.println(numlist);
        System.out.println("Max of Args: "+Collections.max(numlist));
        System.out.println("Mean of Args: "+ findmeanlen(nms));
        Collections.sort(numlist);
        System.out.println(numlist);



    }
}
