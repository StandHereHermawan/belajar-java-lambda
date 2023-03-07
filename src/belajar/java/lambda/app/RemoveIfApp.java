package belajar.java.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("JAVA","PYTHON","SPRINGBOOT","MongoDB","OpennAPI"));

//        //FOR LOOP
//        for (var name : names) {
//            if (name.length() > 5) {
//                names.remove(names);
//            }
//        }

        //REMOVE IF ANONYMOUS CLASS
//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return value.length() > 5;
//            }
//        });

        //LAMBDA
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
