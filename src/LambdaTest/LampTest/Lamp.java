package LambdaTest.LampTest;

public class Lamp implements ElectricityConsumer{
    void lightOn(){
        System.out.println("Light On");
    }
    void lightOff(){
        System.out.println("Light OFF");
    }
    @Override
    public void electricityOn() {
        lightOn();
    }

}
