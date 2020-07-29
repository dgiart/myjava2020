package ClassTest.Inherit;

public class Base {
    int id;
    String name;

    public Base() {
        System.out.println("BASE EMPTY");
    }

    public Base(int id, String name) {
        System.out.println("BASE FULL");
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void foo(){
        System.out.println("BASE foo");
    }
}
