package LambdaTest.LampTest;

public class ElectricityMain {
    public static void main(String[] args) {
        ElectricityConsumer lamp = new Lamp();
        ElectricityConsumer music = new MusicCenter();
        Switcher switcher = new Switcher();
        switcher.setConsumer(lamp);
        switcher.setConsumer(music);
        switcher.setConsumer(
                ()->{
                    System.out.println("FIRE");
                }
        );

        switcher.swithOn();
        long c = switcher.consumers.stream().count();
        System.out.println("" + c + " consumers");

    }


}
