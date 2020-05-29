import java.util.Objects;

//interface A{}
//public abstract class Abstr implements A {
//    static void cc(){}
//    public static void main(String[] args) {
//        System.out.println("I am Abstract");
//    }
//}
abstract class Figure {
    String s;
    int side1;
    int side2;
    double d;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return side1 == figure.side1 &&
                side2 == figure.side2 &&
                Double.compare(figure.d, d) == 0 &&
                Objects.equals(s, figure.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, side1, side2, d);
    }

    public Figure(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    abstract void countArea();
}
class Triangle extends Figure {
    public Triangle(int side1, int side2) {
        super(side1, side2);
    }
    @Override
    void countArea() {
        System.out.print(0.5 * side1 * side2 + ", ");
        System.out.print(0.5 * this.side1 * this.side2 + ", "); //1
    }
}
class Rectangle extends Figure {
    private int side1 = 1;
    private int side2 = 1;
    public Rectangle(int side1, int side2) {
        super(side1, side2);
    }
    @Override
    void countArea() {
        System.out.print(side1 * side2 + ", ");
        System.out.print(super.side1 * super.side2);
    }
}
public class Abstr {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3, 4);
        triangle.countArea();
        Figure rectangle = new Rectangle(1, 2);
        rectangle.countArea();

        int i=10;
        double x=i;
        System.out.println("\n"+rectangle.getClass().getName());
        System.out.println(i*0.5);
        System.out.println(x);
    }
}