package ClassTest;

public class SeasonDay {
//    public static final int WINTER=0;
//    public static final int SPRING=1;
//    public static final int SUMMER=2;
//    public static final int FALL=3;
    private Season season;
    private int day;

    public SeasonDay(Season season, int day) {
        this.season = season;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Season# " +this.season+"; day# "+this.day;
    }
}
