package ClassTest;

public enum MusicType {
    ROCK("Rock"),JAZZ("Jazz"), CLASSIC;
    private String realName;
    private MusicType(){
        System.out.println(this.name()+" " +this.ordinal());
    }

    MusicType(String realName) {

        System.out.println(this +" with ONE parameter");
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
