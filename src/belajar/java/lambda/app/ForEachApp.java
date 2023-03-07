package belajar.java.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("JAVA", "PYTHON","GOLANG","DART","SPRINGBOOT","MongoDB");

        //FOR EACH
        for (var value : list){
            System.out.println(value);
        }

        //FOR EACH ANONYMOUS CLASS
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        //LAMBDA
        list.forEach(value -> System.out.println(value));

        //LAMBDA METHOD REFERENCE
        list.forEach(System.out::println);

    }
}
