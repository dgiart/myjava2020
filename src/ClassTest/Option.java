package ClassTest;

public class Option {
    int x;
    int y;

    public Option(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x="+x+"; y="+y;
    }
}
