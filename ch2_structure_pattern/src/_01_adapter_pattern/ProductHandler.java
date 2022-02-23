package _01_adapter_pattern;

public class ProductHandler {
    private final ProductsService productsService;

    public ProductHandler(ProductsService productsService) {
        this.productsService = productsService;
    }

    public String turnOn(String productName) {
        Products products = productsService.turnOnProduct(productName);
        if (products == null) {
            throw new IllegalArgumentException();
        }
        return products.getInfo();
    }
}
