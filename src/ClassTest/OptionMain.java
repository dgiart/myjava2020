package ClassTest;

import java.util.Optional;

public class OptionMain {
    public static void main(String[] args) {
        Optional <Option>opt=Optional.of(new Option(12,13));
        Option opt1=opt.get();
        System.out.println(opt1);
    }
}
