package vendingmachine.util;

public enum ProductFormat {
    OPEN_SQUARE("["),
    CLOSE_SQUARE("]"),
    CLONE(";"),
    COMMA(",");

    private final String format;

    ProductFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
