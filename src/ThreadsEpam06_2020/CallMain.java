package ThreadsEpam06_2020;

import java.util.concurrent.*;

public class CallMain {
    public static void main(String[] args) {
        ExecutorService service= Executors.newSingleThreadExecutor();
        Future<String> future=service.submit(new CallThread());
        try {
            String result=future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}
