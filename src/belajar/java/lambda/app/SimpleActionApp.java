package belajar.java.lambda.app;

import belajar.java.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {


//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "JAVA";
//            }
//        };
//
//        System.out.println(simpleAction1.action());
//
//        SimpleAction simpleAction2 = () -> {
//            return "JAVA";
//        };
//
//        System.out.println(simpleAction2.action());

        SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = (String value) -> "Hello " + value;
        SimpleAction simpleAction4 = (value) -> "Hello " + value;
        SimpleAction simpleAction5 = value -> "Hello " + value;

        System.out.println(simpleAction1);
        System.out.println(simpleAction2);
        System.out.println(simpleAction3);
        System.out.println(simpleAction4);
        System.out.println(simpleAction5);
    }
}
