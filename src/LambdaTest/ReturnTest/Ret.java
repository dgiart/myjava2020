package LambdaTest.ReturnTest;

public class Ret implements ReturnLambdaTest{
    @Override
    public String testLambda(String text) {
        return "You wrote: " + text;
    }
}
