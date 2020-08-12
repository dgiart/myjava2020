package LambdaTest.LampTest;

public class MusicCenter implements ElectricityConsumer{
    @Override
    public void electricityOn() {
        musicOn();
    }



    void musicOn(){
        System.out.println("Music On");
    }
}
