package _01_adapter_pattern.adapter;

import _01_adapter_pattern.Products;
import _01_adapter_pattern.adaptee.직구제품;

public class To220V implements Products {

    private final 직구제품 product;

    public To220V(직구제품 product) {
        this.product = product;
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public String getInfo() {
        return product.getInfo();
    }

    @Override
    public int getCost() {
        return product.getCost();
    }
}
