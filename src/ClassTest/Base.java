package ClassTest;


public abstract class Base {
    int x;
    String name;
    String v="BASE version";

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    Base(){
        System.out.println("Base Empty");
    }
    Base(int i){
        this.x=i;
    }
   Number print(){
        System.out.println("BASE");
        return 0;
    }
}
class TestFromBase{
    int x;
    void showx(){
        System.out.println("X="+x);
    }
}
