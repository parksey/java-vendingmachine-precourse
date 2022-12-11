package vendingmachine;

import java.util.List;
import java.util.stream.Collectors;

public enum Coin {
    COIN_500(500, "500원 - "),
    COIN_100(100, "100원 - 4"),
    COIN_50(50, "50원 - "),
    COIN_10(10, "10원 - ");

    private final int amount;
    private final String coinMsg;

    Coin(final int amount, final String coinMsg) {
        this.amount = amount;
        this.coinMsg = coinMsg;
    }

    // 추가 기능 구현
    public static List<Integer> getCoinList() {
        return List.of(Coin.values()).stream()
                .map(coin-> coin.amount)
                .collect(Collectors.toList());
    }

    public int getAmount() {
        return amount;
    }

    public String getCoinMsg() {
        return coinMsg;
    }
}
