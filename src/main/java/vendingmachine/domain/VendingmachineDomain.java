package vendingmachine.domain;

public class VendingmachineDomain {
    private Vendingmachine vendingmachine;
    public void setVendingmachine(long amount) {
        vendingmachine = Vendingmachine.of(amount);
    }
}
