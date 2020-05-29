package ClassTest;

public enum Season {
    WINTER,  SPRING,SUMMER, FALL;
    Season(){
        System.out.println(this.name()+" "+this.ordinal());
    }
}
