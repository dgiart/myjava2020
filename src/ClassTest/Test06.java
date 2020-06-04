package ClassTest;
class Aaa {}
class Ba extends Aaa {}
class Ca extends Ba {}


public class Test06 {

        public static void main(String[] args) {
            Aaa object1 = new Aaa();
            Ca object2 = new Ca();
            // line 0
            Aaa o=(Aaa)object2;
//            Ca object3 = (Ca) object1;
        }
    }

