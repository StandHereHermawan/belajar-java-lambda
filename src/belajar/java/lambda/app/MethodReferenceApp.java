package belajar.java.lambda.app;

import belajar.java.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        System.out.println("METHOD REFERENCE STATIC");
        //Predicate<String> predicateIsLowerCase = value -> StringUtil.isLoweCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("python"));
        System.out.println(predicateIsLowerCase.test("JAVA"));

        System.out.println();
        System.out.println("METHOD REFERENCE di PARAMETER");
        Function<String,String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("java"));

    }

    public void run() {
        System.out.println("METHOD REFERENCE NON STATIC");
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("python"));
        System.out.println(predicateIsLowerCase.test("JAVA"));

    }

    public void run2() {
        System.out.println("METHOD REFERENCE OBJECT");
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("python"));
        System.out.println(predicateIsLowerCase.test("JAVA"));

    }

    public boolean isLowerCase(String value){
        for (var c : value.toCharArray()){
            if (!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
