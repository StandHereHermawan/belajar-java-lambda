package belajar.java.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("first_name: ", "Arief");
        map.put("middle_name: ", "Karditya");
        map.put("last_name: ", "Hermawan");

        //FOR LOOP
        for (var entry : map.entrySet()){
            System.out.println(entry.getKey()+ " : " +entry.getValue());
        }

        //FOR EACH ANONYMOUS CLASS
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        //LAMBDA
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
