package ClassTest;

public class Plane {
    PlaneProducer produser;
    String model;

    @Override
    public String toString() {
        return produser +model;
    }

    public Plane(PlaneProducer produser, String model) {
        this.produser = produser;
        this.model = model;

    }
}
