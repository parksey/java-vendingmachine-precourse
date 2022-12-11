package vendingmachine.domain;

public class Product {
    private final String name;
    private final long price;
    private long remainCount;

    public Product(String name, long price, long remainCount) {
        this.name = name;
        this.price = price;
        this.remainCount = remainCount;
    }

}
