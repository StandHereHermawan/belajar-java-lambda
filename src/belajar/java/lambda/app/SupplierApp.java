package belajar.java.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "JAVA LEARN 2023";

        System.out.println(supplier.get());
    }
}
