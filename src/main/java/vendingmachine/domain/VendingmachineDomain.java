package vendingmachine.domain;

import java.util.Map;

public class VendingmachineDomain {
    private Vendingmachine vendingmachine;
    public void setVendingmachine(long amount) {
        vendingmachine = Vendingmachine.of(amount);
    }

    public void setProducts(Map<String, Product> products) {
        vendingmachine.setProductMap(products);
    }

    public void setUserAmount(long amount) {
        vendingmachine.setUserAmount(amount);
    }

    public Map<Integer, Long> getCurrentCoinList() {
        return vendingmachine.getCoinList();
    }

}
