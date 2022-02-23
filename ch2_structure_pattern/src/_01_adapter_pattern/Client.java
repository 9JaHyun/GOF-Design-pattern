package _01_adapter_pattern;

import _01_adapter_pattern.adaptee.직구제품;
import _01_adapter_pattern.adapter.To220V;

public class Client {

    public static void main(String[] args) {
        직구제품 tv = new 직구제품();
        To220V tv200VAdapter = new To220V(tv);
//        ProductHandler productHandler = new ProductHandler(tv200VAdapter);
//        String appleTV = productHandler.turnOn("appleTV");
//        System.out.println(appleTV);
    }
}
