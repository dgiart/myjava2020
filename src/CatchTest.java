public class CatchTest {
    public static void main(String[] args) {
        try {
//            System.out.println(1/0);
        }catch (Exception e){
            System.out.println("EXC");
            return ;
        }finally {
            System.out.println("FIN");
        }
        System.out.println("END");
    }
}
