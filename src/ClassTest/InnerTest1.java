package ClassTest;

public class InnerTest1 {
    private int id=11;
    private String name;
    private Adr adr;

    public void setAdr(Adr adr) {
        this.adr = adr;
    }

    public InnerTest1(){
        System.out.println("EMPTY out");
    }

    public InnerTest1(int id, String name, Adr adr) {
        this.id = id;
        this.name = name;
        this.adr = adr;
        }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Adr getAdr() {
        return adr;
    }

    @Override
    public String toString() {
        return "id: "+id+", name: "+name+", "+adr;
    }

    public class Adr{
        int id=100;
        private String city;
        private String street;
        private int home;


        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getHome() {
            return home;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setHome(int home) {
            this.home = home;
        }

        public Adr() {
          }

        public Adr(String city, String street, int home) {
            this.city = city;
            this.street = street;
            this.home = home;
        }

        @Override
        public String toString() {
            return "City: "+this.city+"; Street: "+this.street+", Home #"+this.home;
        }

        void showId(){
            System.out.println(id);
            System.out.println(InnerTest1.this.id);
        }
    }
}
