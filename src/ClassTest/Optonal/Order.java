package ClassTest.Optonal;

public class Order {
    int id;
    Double value;

    public Order(int id, Double value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "id: "+id+"; value="+value;
        }
}
