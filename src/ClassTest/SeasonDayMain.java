package ClassTest;

public class SeasonDayMain {
    public static void main(String[] args) {
        SeasonDay seasonDay=new SeasonDay(Season.FALL,30);
        System.out.println(seasonDay.toString());
        Season season=Season.WINTER;
        switch (season){
            case FALL:
                System.out.println("fall");
                break;
            case SPRING:
                System.out.println("spring");
                break;
            default:
                System.out.println(season +" is not a season");
        }
        for (Season el: Season.values()) {
            System.out.println(el.toString());
        }
        System.out.println("season.toString()"+season.toString());
        }

}
