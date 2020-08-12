package try_test;

public class TryCatchFinal {
    static void trcatch(){
        try {
            int []list = new int[]{1,2,3};
            System.out.println(list[10]);
//            System.out.println(1/0);
            System.out.println("TRY finished");
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        trcatch();

        System.out.println("main finished");
    }
}
