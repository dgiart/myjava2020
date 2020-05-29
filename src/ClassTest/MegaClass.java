package ClassTest;
public class MegaClass {
    public String toString() {
        return getClass().getName();//getSimpleName();
    }
    public static void main (String [] args) {
        Object obj = new Object();
        Class clazz = obj.getClass();
        System.out.print(clazz.getSuperclass() +" , ");
        Class clazzClass = clazz.getClass();
        System.out.print(clazzClass.getSuperclass());
        System.out.println("\nclazzName="+clazz.getName());
        System.out.println("clazzClazzName="+clazzClass.getName());
        Object n=null;
        System.out.println("null==null???: "+n.equals(n));
//        BasicClass basicClass = new BasicClass();
//        System.out.println (basicClass.toString());
    }
}
class SuperClass extends MegaClass {}
class BasicClass extends SuperClass {}