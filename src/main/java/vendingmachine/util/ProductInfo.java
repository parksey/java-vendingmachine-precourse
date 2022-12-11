package vendingmachine.util;

public enum ProductInfo {
    NAME(0),
    PRICE(1),
    COUNT(2);

    private final int index;

    ProductInfo(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
