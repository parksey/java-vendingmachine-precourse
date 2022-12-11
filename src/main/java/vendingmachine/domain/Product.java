package vendingmachine.domain;

public class Product {
    private final String name;
    private final long price;
    private long remainCount;

    public Product(String name, long price, long remainCount) {
        ProductException.isUnderPrice(price);

        this.name = name;
        this.price = price;
        this.remainCount = remainCount;
    }


    public static Product of(String name, long price, long remainCount) {
        return new Product(name, price, remainCount);
    }
}
