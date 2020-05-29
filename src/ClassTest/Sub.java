package ClassTest;

public class Sub extends Base{
    int y;
    String v="SUB version";

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    Sub(){
        System.out.println("Sub Empty");
    }
    Sub(int i){
        super(i);
        this.y=1000;
    }

    public Sub(int i, int y, String v) {
        super(i);
        this.y = y;
        this.v = v;
    }

    public void sub(){
        System.out.println("SubSub");
    }
//    @Override
    int print(int i) {
        System.out.println("SUB"+i);
        return 10;
    }
}
