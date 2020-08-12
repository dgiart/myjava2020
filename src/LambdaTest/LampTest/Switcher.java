package LambdaTest.LampTest;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    List<ElectricityConsumer> consumers = new ArrayList<>();
    void swithOn(){
        System.out.println("Electricity ON");
        for (ElectricityConsumer consumer:
             consumers) {
            consumer.electricityOn();
        }
    }


    public void setConsumer(ElectricityConsumer consumer) {
        this.consumers.add(consumer);
    }
}
