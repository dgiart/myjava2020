package ClassTest;

public class Immuteble {
    private int id;
    private String name;

    public Immuteble() {
        System.out.println("EMPTY");
    }

    public Immuteble(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
