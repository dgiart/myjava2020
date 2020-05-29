package ClassTest;

public class SubMain {
    public static void main(String[] args) {
//        Base cl=new Sub();

//        System.out.println(cl.v);
//       ( (Sub)cl).print(100);
//       ((Sub) cl).sub();
        Base b=new Sub();
        Sub s1=new Sub(111);
        System.out.println("x1="+s1.x+"; y1="+s1.y+" ;v1="+s1.v+"; name1="+s1.name);
        Sub s2=new Sub();
        System.out.println("x2="+s2.x+"; y2="+s2.y+" ;v2="+s2.v+"; name2="+s2.name);
        Sub s3=new Sub(1,2,"VV");
        System.out.println("x3="+s3.x+"; y3="+s3.y+" ;v3="+s3.v+"; name3="+s3.name);
        Base sB=new Sub(1,2,"VV");
        System.out.println("xB="+sB.x+"; yB="+000+" ;v3="+sB.v+"; name3="+sB.name);
        System.out.println("b class name: "+b.getClass().getSimpleName());
        System.out.println("sB class name: "+sB.getClass().getSimpleName());

    }
}
